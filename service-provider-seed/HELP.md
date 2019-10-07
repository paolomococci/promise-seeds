# Service Provider Seed

## example of use

```
$ curl -v -i http://127.0.0.1:9090/api/seeds
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> GET /api/seeds HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 
HTTP/1.1 200 
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Mon, 07 Oct 2019 19:30:10 GMT
Date: Mon, 07 Oct 2019 19:30:10 GMT

< 
{
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
$curl -v -i -H "Content-Type:application/json" -d "{\"name\":\"seedOne\"}" http://127.0.0.1:9090/api/seeds
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> POST /api/seeds HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> Content-Type:application/json
> Content-Length: 18
> 
* upload completely sent off: 18 out of 18 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 201 
HTTP/1.1 201 
< Location: http://127.0.0.1:9090/api/seeds/1
Location: http://127.0.0.1:9090/api/seeds/1
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Mon, 07 Oct 2019 19:30:43 GMT
Date: Mon, 07 Oct 2019 19:30:43 GMT

< 
{
  "name" : "seedOne",
  "value" : null,
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/1"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
$curl -v -i -X PATCH -H "Content-Type:application/json" -d "{\"value\":\"0.3\"}" http://127.0.0.1:9090/api/seeds/1
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> PATCH /api/seeds/1 HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> Content-Type:application/json
> Content-Length: 15
> 
* upload completely sent off: 15 out of 15 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 201 
HTTP/1.1 201 
< Location: http://127.0.0.1:9090/api/seeds/1
Location: http://127.0.0.1:9090/api/seeds/1
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Mon, 07 Oct 2019 19:32:02 GMT
Date: Mon, 07 Oct 2019 19:32:02 GMT

< 
{
  "name" : "seedOne",
  "value" : 0.3,
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/1"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```
