package com.alanc.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name + ", service is temporary down, please try again later.";
    }
}
