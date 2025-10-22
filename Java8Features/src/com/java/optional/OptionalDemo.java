package com.java.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		//of,empty,ofNullable : static methods
		//empty optional
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		
		//of internally has non null check
		//use of only if you are sure it is not null : or else Exception thrown
		String email = "simran@gmail.com";
		Optional<String> emailOpt = Optional.of(email);
		System.out.println(emailOpt.get());
		
		//ofNullable : if value is null : returns empty object 
		//use  if you are not sure it is not null 
		//email = null;
		Optional<String> stringOptional = Optional.ofNullable(email);
		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		} else {
			System.out.println("no value present");

		}
		
		//orElse method is used to get a default value from Optional
		//if StringOptional is null -> default value
		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		
		//orElsegetMethod
		//takes supplier interface so : lambda
		String defaultOptional2 = stringOptional.orElseGet(() -> "defaultOrElseGet@gmail.com");
		System.out.println(defaultOptional2);
		
		
		//orElseThrow
		String defaultOptional3 = stringOptional.orElseThrow(()-> new IllegalArgumentException("Email does not exist"));
		System.out.println(defaultOptional3);
		
		
	    //ifpprsent 
		Optional<String> gender = Optional.of("MALE");
		gender.ifPresent((s) -> System.out.println("value is present"));
		
		Optional<String> emptyOpt = Optional.empty();
		emptyOpt.ifPresent((s) -> System.out.println("value is present"));
		
		
		//filter method 
		//map method : transforms value from one type to another
		String result = " abc";
		if(result != null && result.contains("abc")) System.out.println(result);
		
		Optional<String> resultObj = Optional.of(result);
		resultObj.filter((s) -> s.contains("abc"))
		.map(String::trim)
		.ifPresent((s) -> System.out.println("abc"));

		
	}

}
