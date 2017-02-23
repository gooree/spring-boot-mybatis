package com.wxjfkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootstrapApplication {

	private static Logger logger = LoggerFactory.getLogger(BootstrapApplication.class);

	public static void main(String[] args) throws Exception {
		logger.debug("start spring-boot-mybatis application.");
		SpringApplication.run(BootstrapApplication.class, args);
	}

}
