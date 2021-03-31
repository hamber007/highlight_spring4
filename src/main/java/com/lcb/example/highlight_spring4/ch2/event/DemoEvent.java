package com.lcb.example.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {//自定义事件
	private static final long serialVersionUID = 1L;
	private String msg;
	public DemoEvent(Object source,String msg) {
		super(source);
		// TODO Auto-generated constructor stub
		this.msg = msg;
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
