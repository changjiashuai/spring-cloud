package com.changjiashuai.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/21.
 */
@FeignClient("eureka-client-verb")
public interface VerbClient {

    /*根据value mapping path查找服务实现，和方法名称无关*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getVerb2();
}
