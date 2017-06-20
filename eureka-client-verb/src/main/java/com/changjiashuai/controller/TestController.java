package com.changjiashuai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/20.
 */
@RestController
public class TestController {
    @Value("${verbs}")
    String verbs;

    @RequestMapping("/")
    public String getVerb() {
        String[] verbArray = verbs.split(",");
        int index = (int) Math.round(Math.random() * (verbArray.length - 1));
        return verbArray[index];
    }
}
