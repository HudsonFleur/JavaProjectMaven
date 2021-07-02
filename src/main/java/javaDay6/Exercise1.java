package javaDay6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Java Day 6 Exercise1
public class Exercise1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		list1.add("Blue");
		list1.add("Red");
		list1.add("Orange");

		// Exercise 1
		System.out.println("List1: " + list1);

		// Exercise 2
		for (String string : list1) {
			System.out.println(string);
		}

		// Exercise 3
		Collections.reverse(list1);
		System.out.println("Reversed List: " + list1);

		// Exercise 4
		Set<String> set1 = new HashSet<String>();
		set1.add("Toyota");
		set1.add("BMW");
		set1.add("Mazda");
		set1.add("Nissan");
		Set<String> set2 = new HashSet<String>();
		set2.add("Lexus");
		set2.add("Infinti");
		set2.add("Mazda");
		set2.add("Nissan");
		set2.add("Mitsubishi");

		set1.retainAll(set2);
		set2.retainAll(set1);
		System.out.println(set1);
		System.out.println(set2);

		// Exercise 5
		Set<Integer> set3 = new TreeSet<Integer>();
		set3.add(2);
		set3.add(7);
		set3.add(4);
		set3.add(24);
		set3.add(72);
		set3.add(29);
		set3.add(94);
		set3.add(53);

		System.out.println(((TreeSet<Integer>) set3).headSet(7));

		// Exercise 6
		Map<String, Integer> personMap = new HashMap<String, Integer>();
		personMap.put("Hudson", 21);
		personMap.put("Stephanie", 22);
		personMap.put("Daisy", 24);
		personMap.put("John", 27);
		System.out.println("Size of mapping is: " + personMap.size());
	}
}
