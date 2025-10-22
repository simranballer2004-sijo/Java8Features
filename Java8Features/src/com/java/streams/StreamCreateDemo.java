package com.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreateDemo {
	public static void main(String[] args) {
		//creating a stream
		Stream<String> stream = Stream.of("a","b","c","d");
		stream.forEach(System.out::println);
		
		//create a stream from sources
		Collection<String> collection = Arrays.asList("JAVA", "J2EE","SPRINGBOOT", "MICROSERVICES");
		Stream<String> streamCollection = collection.stream();
		streamCollection.forEach(System.out::println);
		
		List<String> list = Arrays.asList("J", "J2EE","SPRING", "M");
		Stream<String> streamList = list.stream();
		streamList.forEach(System.out::println);
		
		Set<String> set = new HashSet<>(list);
		Stream<String> streamSet = set.stream();
		streamSet.forEach(System.out::print);
		
		//creating a stream from array collection
		String[] strArray = {"a","b","c","d","e","f"};
		Stream<String> streamArr = Arrays.stream(strArray);
		streamArr.forEach(System.out::print);
		
	}
	

}
