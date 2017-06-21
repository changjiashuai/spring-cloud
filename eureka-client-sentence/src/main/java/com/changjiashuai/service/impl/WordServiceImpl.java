package com.changjiashuai.service.impl;

import com.changjiashuai.client.SubjectClient;
import com.changjiashuai.client.VerbClient;
import com.changjiashuai.service.WordService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/21.
 */
@Service
public class WordServiceImpl implements WordService {

    @Autowired
    SubjectClient subjectClient;
    @Autowired
    VerbClient verbClient;

    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    @Override
    public String getWord() {
        return subjectClient.getWord();
    }

    @HystrixCommand(fallbackMethod = "getFallbackVerb")
    @Override
    public String getVerb() {
        return verbClient.getVerb2();
    }

    public String getFallbackSubject() {
        return "[error subject]";
    }

    public String getFallbackVerb() {
        return "[error verb]";
    }
}
