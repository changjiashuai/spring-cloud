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

    @Value("${words}")
    String words;

    @RequestMapping("/")
    public String getWord() {
        String[] wordArray = words.split(",");
        int index = (int) Math.round(Math.random() * (wordArray.length - 1));
        return wordArray[index];
    }
}
