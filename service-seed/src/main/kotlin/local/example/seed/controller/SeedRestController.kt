/**
 *
 * Copyright 2019 paolo mococci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed following in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package local.example.seed.controller

import local.example.seed.assembler.SeedResourceAssembler
import local.example.seed.exception.SeedNotFoundException
import local.example.seed.model.Seed
import local.example.seed.repository.SeedRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.hateoas.Resource
import org.springframework.hateoas.Resources
import org.springframework.hateoas.mvc.ControllerLinkBuilder
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import java.net.URISyntaxException

@RestController
@RequestMapping(value = ["/api/seeds"])
class SeedRestController(
        @Autowired private val seedRepository: SeedRepository,
        @Autowired private val seedResourceAssembler: SeedResourceAssembler
) {

    @PostMapping
    @Throws(URISyntaxException::class)
    internal fun create(@RequestBody seed: Seed): ResponseEntity<Resource<Seed>> {
        val resource = seedResourceAssembler.toResource(seedRepository.save(seed))
        return ResponseEntity.created(URI(resource.id.expand().href)).body(resource)
    }

    @GetMapping(value = ["/{id}"])
    @Throws(URISyntaxException::class)
    internal fun read(@PathVariable id: Long?): Resource<Seed> {
        val seed = seedRepository.findById(id!!)
                .orElseThrow {
                    SeedNotFoundException(id)
                }
        return seedResourceAssembler.toResource(seed)
    }

    @GetMapping
    @Throws(URISyntaxException::class)
    internal fun readAll(): Resources<Resource<Seed>> {
        val seeds: List<Resource<Seed>> = seedRepository.findAll()
                .asSequence()
                .map(seedResourceAssembler::toResource).toList()
        return Resources(
                seeds,
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(SeedRestController::class.java
                        ).readAll()).withSelfRel()
        )
    }
}
