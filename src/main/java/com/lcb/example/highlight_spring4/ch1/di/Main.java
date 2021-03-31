package com.lcb.example.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(DiConfig.class); //1
		
		UseFunctionService useFunctionService =
				contex.getBean(UseFunctionService.class); //2
		System.out.println(useFunctionService.SayHello("di"));
		contex.close();
	}
}
