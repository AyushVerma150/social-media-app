package com.in28minutes.rest.webservices.restfulwebservices.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

// Create a Rest API
@RestController
public class HelloWorldController {


    @Autowired
    private MessageSource messageSource;

    // Create a URI
    // @RequestMapping(method = RequestMethod.GET , path = "/hello-world")
    // How to return JSON back to the request Source!
    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello World";
    }


    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean( "Hello World" );
    }

    @GetMapping("hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPath(@PathVariable String name) {
        return new HelloWorldBean( "Hello World" + ' ' + name );
    }

    @GetMapping("hello-world-i18n")
    public String helloWorldI18n() {
        Locale locale = LocaleContextHolder.getLocale( );
        System.out.println( locale );
        return messageSource.getMessage( "good.morning.message", null, "Default Message", locale );
    }
}