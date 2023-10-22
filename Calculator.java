package com.miit.java;

public class Calculator {
	
	public static void main(String args[]) {
	System.out.println(add(2,4));
	System.out.println(subtract(4,2));
	System.out.println(multiply(2,4));
	System.out.println(div(8,4));
	

	
}
	

	
public static int add(int a,int b) {
	return a+b;
}
public static int subtract(int a,int b) {
	return a-b;
}
public static int multiply(int a,int b) {
	return a*b;
}
public static int div(int a,int b) {
	return a/b;
}

	
}

