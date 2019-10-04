# Service Seed

## Queries

### Sample GET request
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
< Date: Fri, 04 Oct 2019 06:43:59 GMT
Date: Fri, 04 Oct 2019 06:43:59 GMT

< 
{
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```

### POST request
```
$ curl -v -i -H "Content-Type:application/json" -d "{\"name\":\"sample\"}" http://127.0.0.1:9090/api/seeds
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> POST /api/seeds HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> Content-Type:application/json
> Content-Length: 17
> 
* upload completely sent off: 17 out of 17 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 201 
HTTP/1.1 201 
< Location: http://127.0.0.1:9090/api/seeds/1
Location: http://127.0.0.1:9090/api/seeds/1
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Fri, 04 Oct 2019 06:45:38 GMT
Date: Fri, 04 Oct 2019 06:45:38 GMT

< 
{
  "name" : "sample",
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

### GET request
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
< Date: Fri, 04 Oct 2019 06:46:54 GMT
Date: Fri, 04 Oct 2019 06:46:54 GMT

< 
{
  "_embedded" : {
    "seeds" : [ {
      "name" : "sample",
      "_links" : {
        "self" : {
          "href" : "http://127.0.0.1:9090/api/seeds/1"
        },
        "seeds" : {
          "href" : "http://127.0.0.1:9090/api/seeds"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```
