package com.miit.java;

public class Employeedata {
	int age;
	String name;
	
	public Employeedata(int age,String name) {
	this.age=age;
	this.name=name;
	}
	
	
	public static void main(String agrs[]) {
		
		Employeedata obj1=new Employeedata(30,"Bob");
		Employeedata obj2=new Employeedata(40,"Matt");
		System.out.println(obj1.age);
		System.out.println(obj2.name);
		
	}

}
