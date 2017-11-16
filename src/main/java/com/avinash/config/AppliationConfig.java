package com.avinash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.avinash.bean.ClassA;
import com.avinash.bean.ClassB;

@Configuration
@Import(SecondConfigiration.class)
public class AppliationConfig {
/*<bean id="beanA" class="com.avinash.bean.ClassA">
		<property name="dependency" ref="beanB" />
	</bean>

	<bean id="beanB" class="com.avinash.bean.ClassB">
			<property name="value" value="Bean B Value" />
	
</bean>

 * */
	
//Way 1
	
	@Bean(initMethod="createBeanA")
	public ClassA beanA(ClassB depen){
		
		ClassA beanASetting = new ClassA();
		beanASetting.setDependency(depen);
		return beanASetting;
	}
	
	//way 2
	/*
	@Bean
	public ClassA beanA(){
		
		ClassA beanASetting = new ClassA();
		beanASetting.setDependency(beanB());
		return beanASetting;
	}
	*/
	
}
