package com.lcb.example.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.lcb.example.highlight_spring4.ch3.conditional")
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class) //1
	public ListService windowsListService() {
		return new WindowsListService();
	}
	@Bean
	@Conditional(LinuxCondition.class) //2
	public ListService linuxListServie() {
		return new LinuxListService();
	}
}
