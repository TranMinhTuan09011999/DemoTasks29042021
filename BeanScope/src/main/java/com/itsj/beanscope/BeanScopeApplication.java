package com.itsj.beanscope;

import com.itsj.prototype.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.itsj.singleton.AppConfig;
import com.itsj.singleton.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanScopeApplication {

	public static void main(String[] args) {
		ApplicationContext context1 = SpringApplication.run(BeanScopeApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = context.getBean(MessageService.class);
		messageService.setMessage("TwitterMessageService Implementation");
		System.out.println(messageService.getMessage());
		MessageService messageService1 = context.getBean(MessageService.class);
		System.out.println(messageService1.getMessage());

		/*---------------- Prototype ----------------*/
		AccountService service1 = context.getBean("accountService", AccountService.class);
		service1.setAccountHolder("TUAN");
		System.out.println(service1.getAccountHolder());

		AccountService service2 = context.getBean("accountService", AccountService.class);
		System.out.println(service2.getAccountHolder());
	}

}
