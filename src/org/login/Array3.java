package org.login;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array3 {                           //Map program
	public static void main(String[] args) {
		
		Map<Integer,String>m = new LinkedHashMap<>(); 
		
	//To add the value to the map
		m.put(10, "java");
		m.put(20, "python");
		m.put(30,"ruby");
		m.put(40, "csharp");
		m.put(50, "Java");
		m.put(30, "oracle");
		System.out.println(m);
		
//to find the size
		 int size = m.size();
		 System.out.println(size);
		 
	// displaying the corresponding key value
		 String string = m.get(50);
		System.out.println(string);
		
	//remove the value from map 
		m.remove(40);
		System.out.println(m);
		
	// use the particular key is present or not
		boolean containsKey = m.containsKey(30);
		System.out.println(containsKey);
		
	//	use the particular VALUE  is present or not
		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);
		
	// displaying the value only and its return type is collection
		Collection<String> values = m.values();
		System.out.println(values);
		
	// displaying the keys only and its return type is set	
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
	// TO CONVERT THE MAP TO SET
		    Set<Entry<Integer, String>> entrySet = m.entrySet();
		    System.out.println(entrySet);
		
	// to iterate the map
		    
		    System.out.println("for each loop");
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
		}	
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			
			
			
			
			
		}
			
			
		}
		
		
		
	}


