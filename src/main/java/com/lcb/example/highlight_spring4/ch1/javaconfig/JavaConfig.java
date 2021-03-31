package com.lcb.example.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //1
public class JavaConfig {
	@Bean //2
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService()); //3
		return useFunctionService;
	}
	
	
}
