package com.itsj.lifecyclebean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LifeCycleBeanApplication {

	public static void main(String[] args) {
		// ApplicationContext is container, contains the entire Beans
		System.out.println("> Before khi IoC Container is initialized");
		ApplicationContext context = SpringApplication.run(LifeCycleBeanApplication.class, args);
		System.out.println("> After IoC Container is initialized");

		// After running,  context will contain Beans marked  @Component.

		Girl girl = context.getBean(Girl.class);

		System.out.println("> Before khi IoC Container destroy Girl");
		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
		System.out.println("> After IoC Container destroy Girl");
	}

}
