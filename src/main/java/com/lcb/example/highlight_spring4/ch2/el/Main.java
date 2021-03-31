package com.lcb.example.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ResourceConfig.class);
		ElConfig resourceService = context.getBean(ElConfig.class);
		
		resourceService.outputResource();
		
		context.close();
	}

}
