package com.lcb.example.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;

public class DemoListener implements ApplicationListener<DemoEvent> {//1

	public void onApplicationEvent(DemoEvent event) {//2
		
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到bean-demoPubisher发布的消息:"+msg);
	}
}
