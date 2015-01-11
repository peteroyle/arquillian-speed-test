package com.example.test;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Local
@Path("hello")
public interface HelloLocal {

    @GET
    String sayHelloLocal(@QueryParam("name") String name);

}
