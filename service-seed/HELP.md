# Service Seed

## Queries

### initial GET request
```
$ curl -v -i  http://127.0.0.1:9090/api/seeds
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
< Date: Fri, 04 Oct 2019 09:47:55 GMT
Date: Fri, 04 Oct 2019 09:47:55 GMT

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

### I insert some items with the POST method (implicit)
```
$ curl -v -i -H "Content-Type:application/json" -d "{\"name\":\"seedOne\"}" http://127.0.0.1:9090/api/seeds
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
< Date: Fri, 04 Oct 2019 09:49:15 GMT
Date: Fri, 04 Oct 2019 09:49:15 GMT

< 
{
  "name" : "seedOne",
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

$  curl -v -i -H "Content-Type:application/json" -d "{\"name\":\"seedTwo\"}" http://127.0.0.1:9090/api/seeds
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
< Location: http://127.0.0.1:9090/api/seeds/2
Location: http://127.0.0.1:9090/api/seeds/2
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Fri, 04 Oct 2019 09:50:05 GMT
Date: Fri, 04 Oct 2019 09:50:05 GMT

< 
{
  "name" : "seedTwo",
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/2"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}

$  curl -v -i -H "Content-Type:application/json" -d "{\"name\":\"seedThree\"}" http://127.0.0.1:9090/api/seeds
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> POST /api/seeds HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> Content-Type:application/json
> Content-Length: 20
> 
* upload completely sent off: 20 out of 20 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 201 
HTTP/1.1 201 
< Location: http://127.0.0.1:9090/api/seeds/3
Location: http://127.0.0.1:9090/api/seeds/3
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Fri, 04 Oct 2019 09:50:50 GMT
Date: Fri, 04 Oct 2019 09:50:50 GMT

< 
{
  "name" : "seedThree",
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/3"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```

### now I make a generic request again
```
$ curl -v -i " http://127.0.0.1:9090/api/seeds
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
< Date: Fri, 04 Oct 2019 09:51:39 GMT
Date: Fri, 04 Oct 2019 09:51:39 GMT

< 
{
  "_embedded" : {
    "seeds" : [ {
      "name" : "seedOne",
      "_links" : {
        "self" : {
          "href" : "http://127.0.0.1:9090/api/seeds/1"
        },
        "seeds" : {
          "href" : "http://127.0.0.1:9090/api/seeds"
        }
      }
    }, {
      "name" : "seedTwo",
      "_links" : {
        "self" : {
          "href" : "http://127.0.0.1:9090/api/seeds/2"
        },
        "seeds" : {
          "href" : "http://127.0.0.1:9090/api/seeds"
        }
      }
    }, {
      "name" : "seedThree",
      "_links" : {
        "self" : {
          "href" : "http://127.0.0.1:9090/api/seeds/3"
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

### I make a request for a specific identifier
```
$  curl -v -i  http://127.0.0.1:9090/api/seeds/3
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> GET /api/seeds/3 HTTP/1.1
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
< Date: Fri, 04 Oct 2019 09:52:28 GMT
Date: Fri, 04 Oct 2019 09:52:28 GMT

< 
{
  "name" : "seedThree",
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/3"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```

### I change the name field with the PUT method
```
$ curl -v -i -X PUT -H "Content-Type:application/json" -d "{\"name\":\"someOne\"}" http://127.0.0.1:9090/api/seeds/3
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> PUT /api/seeds/3 HTTP/1.1
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
< Location: http://127.0.0.1:9090/api/seeds/3
Location: http://127.0.0.1:9090/api/seeds/3
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Fri, 04 Oct 2019 09:54:48 GMT
Date: Fri, 04 Oct 2019 09:54:48 GMT

< 
{
  "name" : "someOne",
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/3"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```

### I change the name with the PATCH method
```
$ curl -v -i -X PATCH -H "Content-Type:application/json" -d "{\"name\":\"anotherOne\"}" http://127.0.0.1:9090/api/seeds/3
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> PATCH /api/seeds/3 HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> Content-Type:application/json
> Content-Length: 21
> 
* upload completely sent off: 21 out of 21 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 201 
HTTP/1.1 201 
< Location: http://127.0.0.1:9090/api/seeds/3
Location: http://127.0.0.1:9090/api/seeds/3
< Content-Type: application/hal+json;charset=UTF-8
Content-Type: application/hal+json;charset=UTF-8
< Transfer-Encoding: chunked
Transfer-Encoding: chunked
< Date: Fri, 04 Oct 2019 09:57:36 GMT
Date: Fri, 04 Oct 2019 09:57:36 GMT

< 
{
  "name" : "anotherOne",
  "_links" : {
    "self" : {
      "href" : "http://127.0.0.1:9090/api/seeds/3"
    },
    "seeds" : {
      "href" : "http://127.0.0.1:9090/api/seeds"
    }
  }
* Connection #0 to host 127.0.0.1 left intact
}
```

### with the DELETE method I remove the item identified with the number 3
```
$ curl -v -i -X DELETE http://127.0.0.1:9090/api/seeds/3
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> DELETE /api/seeds/3 HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 204 
HTTP/1.1 204 
< Date: Fri, 04 Oct 2019 09:59:17 GMT
Date: Fri, 04 Oct 2019 09:59:17 GMT

< 
* Connection #0 to host 127.0.0.1 left intact
```

### I request a list of currently registered items
```
$  curl -v -i  http://127.0.0.1:9090/api/seeds
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
< Date: Fri, 04 Oct 2019 09:59:58 GMT
Date: Fri, 04 Oct 2019 09:59:58 GMT

< 
{
  "_embedded" : {
    "seeds" : [ {
      "name" : "seedOne",
      "_links" : {
        "self" : {
          "href" : "http://127.0.0.1:9090/api/seeds/1"
        },
        "seeds" : {
          "href" : "http://127.0.0.1:9090/api/seeds"
        }
      }
    }, {
      "name" : "seedTwo",
      "_links" : {
        "self" : {
          "href" : "http://127.0.0.1:9090/api/seeds/2"
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

### I run a specific request again for id
```
$ curl -v -i  http://127.0.0.1:9090/api/seeds/3
*   Trying 127.0.0.1:9090...
* TCP_NODELAY set
* Connected to 127.0.0.1 (127.0.0.1) port 9090 (#0)
> GET /api/seeds/3 HTTP/1.1
> Host: 127.0.0.1:9090
> User-Agent: curl/7.65.3
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 404 
HTTP/1.1 404 
< Content-Type: text/plain;charset=UTF-8
Content-Type: text/plain;charset=UTF-8
< Content-Length: 25
Content-Length: 25
< Date: Fri, 04 Oct 2019 10:00:42 GMT
Date: Fri, 04 Oct 2019 10:00:42 GMT

< 
* Connection #0 to host 127.0.0.1 left intact
```
