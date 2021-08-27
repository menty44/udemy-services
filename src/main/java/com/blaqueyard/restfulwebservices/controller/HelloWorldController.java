package com.blaqueyard.restfulwebservices.controller;


import com.blaqueyard.restfulwebservices.beans.HelloWorldBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("kaka");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-bean/variable/{name}")
    public HelloWorldBean helloBeanPathParam(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello, %s", name));
    }
}
