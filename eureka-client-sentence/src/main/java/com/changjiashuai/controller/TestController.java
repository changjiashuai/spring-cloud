package com.changjiashuai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * changjiashuai@gmail.com.
 *
 * Created by CJS on 2017/6/20.
 */
@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/sentence")
    public String getSentence() {
        return getWord("eureka-client-subject") + " "
                + getWord("eureka-client-verb") + "...";
    }

    private String getWord(String service) {
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(service);
        if (serviceInstances != null && serviceInstances.size() > 0) {
            URI uri = serviceInstances.get(0).getUri();
            if (uri != null) {
                return new RestTemplate().getForObject(uri, String.class);
            }
        }
        return null;
    }
}
