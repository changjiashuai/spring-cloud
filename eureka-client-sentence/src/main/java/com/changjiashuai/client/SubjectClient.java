package com.changjiashuai.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/21.
 */
@FeignClient("eureka-client-subject")
public interface SubjectClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getWord();
}
