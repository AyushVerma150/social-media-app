package com.in28minutes.rest.webservices.restfulwebservices.hello;

import org.springframework.web.bind.annotation.*;

// Create a Rest API
@RestController
public class HelloWorldController {

    // Create a URI
    // @RequestMapping(method = RequestMethod.GET , path = "/hello-world")
    // How to return JSON back to the request Source!
    @GetMapping("hello-world")
    public String helloWorld(){
        return "Hello World";
    }


    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPath(@PathVariable String name){
        return new HelloWorldBean("Hello World" + ' ' + name);
    }
}