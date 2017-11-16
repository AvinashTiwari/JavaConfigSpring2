package com.avinash.bean;

public class ClassA {
	private ClassB dependency;
	
	public ClassB getDependency()
	{
		return dependency;
	}
	public void setDependency(ClassB dependency)
	{
		this.dependency = dependency;
	}
	
	public void bussinessmethod()
	{
		System.out.println(dependency.getValue());
		
	}
	
	public void createBeanA(){
		System.out.println(" create bean A");
	}

}
