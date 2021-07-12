package javaDay11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Exercise1 {
	
	// Exercise 1.1
	interface FunctionalInterface {

		public Double getProduct(Double a, Double b);
	}
	
	// Exercise 1.2
	interface StringFunction
	{
		public void returnString();
	}
	
	// Exercise 1.3
	interface constructorRef
	{
		public void printStr();
	}

	public static void main(String[] args) {
		
		// Exercise 1.1
		FunctionalInterface funcInterface = (a,b) -> {
			return a*b;
		};
		
		System.out.println(funcInterface.getProduct(20.0, 32.5));
		
		// Exercise 1.2
		StringFunction stringFunction = () -> {
			System.out.println("Here is a lamdba String");
		};
		stringFunction.returnString();
		
		// Exercise 1.3
		constructorRef conRef = () -> new ArrayList<Integer>();
		
		
		// Exercise 3
		List<Integer> list = Arrays.asList(1,3,65,3,76,7,4,46,2,2);
		
		Integer sumofList = list.stream().filter(value -> value % 2 != 0).reduce(0, Integer::sum);
		System.out.println(sumofList);

	}	
}