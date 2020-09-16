package com.lp.spring.basics.springin5steps;

import com.lp.spring.basics.componentscan.ComponentDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lp.spring.basics.componentscan")
public class SpringScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringScanApplication.class, args);
		
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
		

	}

}
