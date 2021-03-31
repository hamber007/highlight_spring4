package com.lcb.example.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
//		context.getEnvironment().setActiveProfiles("prod");//1
		context.getEnvironment().setActiveProfiles("dev");//1
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}

}
