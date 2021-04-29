package com.itsj.requestandapplicationandsession;

import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

public class HelloMessageGenerator {
    private String message;

    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopedBean() {
        return new HelloMessageGenerator();
    }

    @Bean
    @SessionScope
    public HelloMessageGenerator sessionScopedBean() {
        return new HelloMessageGenerator();
    }

    @Bean
    @ApplicationScope
    public HelloMessageGenerator applicationScopedBean() {
        return new HelloMessageGenerator();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
