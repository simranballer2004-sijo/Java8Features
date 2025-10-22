package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SteamsCountMinMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		//count
			System.out.println(list.stream().count());
		//min
			System.out.println(list.stream().min(Comparator.comparing(Integer::valueOf)).get());
		//max
			System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());

	}

}
