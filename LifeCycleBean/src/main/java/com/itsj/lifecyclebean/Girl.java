package com.itsj.lifecyclebean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Girl {

    @PostConstruct
    public void postConstruct(){
        System.out.println("\t>> Object Girl after initializing will run this method");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("\t>> Object Girl before be destroyed will run this method");
    }
}
