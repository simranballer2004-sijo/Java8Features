package com.java.foreach;

import java.util.*;

public class ForEachDemoSet {

	public static void main(String[] args) {
		Set<Persons> persons = new HashSet<>();
		persons.add(new Persons("Simran",27));
		persons.add(new Persons("Tejas",30));
		persons.add(new Persons("Indira",28));
		persons.add(new Persons("Rajen",29));
		persons.add(new Persons("Simran",27));

		//before java 8
		for(Persons person: persons) {
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

class Persons {
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
	public Persons(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
