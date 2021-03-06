package com.changjiashuai.controller;

import com.changjiashuai.client.VerbClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/21.
 */
@RestController
public class FeignClientTestController {

    @Autowired
    private VerbClient testClient;

    @RequestMapping("/feignTest")
    public String getWord() {
        return testClient.getVerb2();
    }
}
