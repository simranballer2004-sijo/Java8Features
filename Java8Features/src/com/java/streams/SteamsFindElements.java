package com.java.streams;

import java.util.*;


public class SteamsFindElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		//find first
		
		Optional<Integer> element = list.stream().findFirst();
		if (element.isPresent()) {
			System.out.println(element.get());
		} else {
			System.out.println("Stream is empty");
		}
		
		//findAny : in parallel stream it could be anything, otherwise it will also ollow the squence
		Optional<Integer> element2 = list.stream().findAny();
		if (element2.isPresent()) {
			System.out.println(element.get());
		} else {
			System.out.println("Stream is empty");
		}
	}

}
