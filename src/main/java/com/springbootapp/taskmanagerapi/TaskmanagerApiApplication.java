package com.springbootapp.taskmanagerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TaskmanagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApiApplication.class, args);
		
	}

}
