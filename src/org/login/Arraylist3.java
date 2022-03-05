package org.login;

import java.util.LinkedHashSet;
import java.util.Set;
                                             //SET PROGRAM
public class Arraylist3{
	
	public static void main(String[] args) {
		
		// set syntax
		Set<Integer> s = new LinkedHashSet<>();
		
	//to add the value from set
		  s.add(10);
		  s.add(20);
		  s.add(30);
		  s.add(40);
		  s.add(50);
		  s.add(10);
		 System.out.println(s);
		 
//to find the size of set
		 int size = s.size();
		 System.out.println(size);
		 
//to check the particular value present or not
		 boolean contains = s.contains(30);
		 System.out.println(contains);
		 
//to remove the particular value
		 s.remove(20);
		 System.out.println(s);
		 
//to check the set is empty or not
		 boolean empty = s.isEmpty();
		 System.out.println(empty);
		 
//to iterate the set
		 System.out.println("for each loop");
		 
		 for (Integer a : s) {
			 System.out.println(a);
			 	
		}
		 
		 System.out.println("=====================");
		 
		 Set<Integer>s1 = new LinkedHashSet();
		
		System.out.println(s1);
		
	//to add the all value s1 from set s
		s1.addAll(s);
		System.out.println(s1);
		
	//to add some extra value  to set s1
		s1.add(78);
		s1.add(87);
		s1.add(33);
		System.out.println(s1);
		
		
// to remove s from set s1
//		s1.removeAll(s);
	//	System.out.println(s1);   
		
// to retain the s value from s1
		s1.retainAll(s);
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
	
	
	
	

}
