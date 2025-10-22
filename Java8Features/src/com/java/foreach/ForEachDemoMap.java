package com.java.foreach;
import java.util.*;
import com.java.foreach.ForEachDemoArray;
public class ForEachDemoMap {

	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<>();
		
		map.put(1,  new Person("simran", 20));
		map.put(2,  new Person("tejas", 25));
		map.put(3,  new Person("yash", 23));

		//before java 8
		
		for(java.util.Map.Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
		
		//using java 8 foreach
		map.forEach((k ,v)-> {
			System.out.println(k);
			System.out.println(v.getName());
		});
		
		//using streams and foreach
		map.entrySet().stream().forEach(x -> {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		});
		

	}

}
