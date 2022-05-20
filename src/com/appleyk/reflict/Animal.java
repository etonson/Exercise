package com.appleyk.reflict;

public class Animal {
	public String name = "Dog";
	private int age = 30;

	public Animal() {
		System.out.println("Animal");
	}

	public Animal(String name, int age) {
		System.out.print(name + "," + age);
	}

	public String sayName(String name) {
		return "Hello  " + name;
	}
}