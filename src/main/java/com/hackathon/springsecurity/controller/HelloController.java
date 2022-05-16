package com.hackathon.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    //@PreAuthorize("hasRole('Contributor')")
    public  String sayHello(){
return "hello Mr";
    }
}
