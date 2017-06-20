package com.changjiashuai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CJS on 2017/6/18.
 */
@RestController
public class InfoController {

    @Value("${info}")
    String info;

    @RequestMapping("/info")
    public String showInfo() {
        return "The info is: " + info;
    }
}
