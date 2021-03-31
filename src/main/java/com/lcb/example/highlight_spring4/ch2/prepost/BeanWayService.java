package com.lcb.example.highlight_spring4.ch2.prepost;


public class BeanWayService {//使用@Bean形式的Bean
	public void init() {
		System.out.println("@Bean-init-method");
	}
	public BeanWayService() {
		super();
		System.out.println("初始化构造函数-BeanWayService");
		
	}
	public void destroy() {
		System.out.println("@Bean-destroy-method");
	}
}
