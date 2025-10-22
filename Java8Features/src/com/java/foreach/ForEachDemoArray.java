package com.java.foreach;

import java.util.*;

public class ForEachDemoArray {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Simran",27));
		persons.add(new Person("Tejas",30));
		persons.add(new Person("Indira",28));
		persons.add(new Person("Rajen",29));
		
		//before java 8
		for(Person person: persons) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		}
		
		//after java 8
		persons.forEach(person -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});

		
		//wih stream + foreach
		
		persons.stream().forEach(person -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
		
	}

}

class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
