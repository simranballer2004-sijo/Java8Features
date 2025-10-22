package com.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
	    return "Employee{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", age=" + age +
	            ", salary=" + salary +
	            '}';
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}

public class StreamListSorting2 {

	public static void main(String[] args) {
		//sort employees by salary in ascending order
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Simran", 30 , 4000000));
		employees.add(new Employee(20, "Tejas", 40, 3500000));
		employees.add(new Employee(30, "Indira", 20 , 4400000));
		employees.add(new Employee(40, "Rajen", 35 , 4400000));
		
		
		//using anonymous function
		List<Employee> sortedList = employees.stream().sorted(new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
				
				return (int) (o1.getSalary() - o2.getSalary());
			}
			
		}).collect(Collectors.toList());
		
		System.out.println(sortedList);
		//suing lambda : ascending
				sortedList.stream().sorted((o1,o2) ->(int) (o1.getSalary() - o2.getSalary()))
							.forEach(System.out::println);
				
				//using comparator : ascending 
		sortedList.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.forEach(System.out::println);
		
		
		//suing lambda : descending
		sortedList.stream().sorted((o1,o2) ->(int) (o2.getSalary() - o1.getSalary()))
					.forEach(System.out::println);
		
		//using comparator : descending 
		sortedList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
		.forEach(System.out::println);
		
		
		

	}

}
