package com.avinash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.avinash.bean.ClassB;

@Configuration
public class SecondConfigiration {
	@Bean(destroyMethod="destroyedBean")
	public ClassB beanB()
	{
		ClassB beanBSetting = new ClassB();
		beanBSetting.setValue("Some vale from Bean B");
		return beanBSetting;
	}
}
