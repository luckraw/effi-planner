package com.luckraw.effi_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.luckraw.effi_planner")
public class EffiPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EffiPlannerApplication.class, args);
	}

}
