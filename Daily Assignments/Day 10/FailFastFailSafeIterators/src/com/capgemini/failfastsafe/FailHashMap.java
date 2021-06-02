package com.capgemini.failfastsafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailHashMap {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> names = new ConcurrentHashMap<Integer, String>();
		names.put(1, "Hero");
		names.put(2, "Hero2");
		names.put(3, "Hero3");
		names.put(4, "Hero4");
		names.put(5, "Hero5");
		try {
			System.out.println("Names in the HashMap: ");
			Iterator<String> itr = names.values().iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println("Adding an element in between iteration");
				names.put(8, "Hiralal");
			}
		} catch (Exception e) { 
			System.out.println(e); 
		} finally { 
			System.out.println("Finally block"); 
		}
	}
}
