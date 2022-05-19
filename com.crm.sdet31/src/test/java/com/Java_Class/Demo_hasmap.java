package com.Java_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


   class Demo_hasmap {
	 public static void main(String[] args) {
		
		HashMap map = new HashMap<>();
		map.put(10, "Ram");
		map.put(20, "shyam");
		map.put(15, "punit");
		map.put(14, "manish");
		
		ArrayList alist = new ArrayList(map.keySet());
		Collections.sort(alist);
		System.out.println(alist);
		Collections.reverse(alist);
		System.out.println(alist);
	}
	

}
