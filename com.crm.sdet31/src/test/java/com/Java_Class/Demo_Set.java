package com.Java_Class;

import java.util.HashSet;

public class Demo_Set {
	public static void main(String[] args) {
		
		HashSet set = new HashSet<>();
		set.add(10);
		set.add("abc");

		set.add(9);

		set.add(12);
		set.add(null);
		set.add(null);
		System.out.println(set);

	}

}
