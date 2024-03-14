package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpAproject2TablesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbJpAproject2TablesApplication.class, args);
	                            EmpService bean = run.getBean(EmpService.class);
	                              // bean.getdata();
	                                bean.fetch("abhi");
	                                
	}

}
