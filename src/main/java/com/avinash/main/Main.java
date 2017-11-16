package com.avinash.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avinash.bean.ClassA;
import com.avinash.config.AppliationConfig;
import com.avinash.config.SecondConfigiration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppliationConfig.class);
		ClassA bean = container.getBean(ClassA.class);
		bean.bussinessmethod();
		container.close();
	}

}
