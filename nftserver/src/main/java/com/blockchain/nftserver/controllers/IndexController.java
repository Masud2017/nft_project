package com.blockchain.nftserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world this is a rest controller";
    }
}
