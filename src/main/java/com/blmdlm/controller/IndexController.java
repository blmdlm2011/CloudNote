package com.blmdlm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gejing on 17-3-15.
 */
@RestController
public class IndexController {

    @Value("${word}")
    private String word;

    @GetMapping("/hello")
    public String say(){
        return word;
    }
}
