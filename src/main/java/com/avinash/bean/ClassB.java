package com.avinash.bean;

public class ClassB {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void destroyedBean()
	{
		System.out.println("bean got destroyed ");
	}

}
