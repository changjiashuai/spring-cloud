package com.changjiashuai.controller;

import com.changjiashuai.service.WordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/21.
 */
@RestController
public class HystrixTestController {

    @Autowired
    WordService wordService;

    @RequestMapping("/hystrixTest")
    public String getSentence() {
        return wordService.getWord() + " " + wordService.getVerb();
    }
}
