package com.lcb.example.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		
//		ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);
		
	}

}
