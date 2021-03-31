package com.lcb.example.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {//使用JSR250形式的Bean
	@PostConstruct //1
	public void init() {
		System.out.println("jsr250-init-method");
	}
	public JSR250WayService() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
	@PreDestroy //2
	public void destroy() {
		System.out.println("jsr250-destroy-method");
	}

}
