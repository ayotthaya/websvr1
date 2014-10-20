package io.ayotth.web.websvr1.service.impl;

import org.springframework.stereotype.Service;

import io.ayotth.web.websvr1.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String getNewName(String userName) {
        return "hello spring!"+userName;
    }
}
