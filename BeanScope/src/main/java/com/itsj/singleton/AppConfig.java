package com.itsj.singleton;

import com.itsj.prototype.AccountService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class AppConfig {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MessageService messageService() {
        return new TwitterMessageService();
    }

    @Bean("accountService")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public AccountService getAccountService() {
        return new AccountService();
    }
}
