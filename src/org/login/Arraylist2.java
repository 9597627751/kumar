package org.login;

import java.util.*;

public class Arraylist2 {
	
	
		
		public static void main(String[] args) {
		
	// integer
		
					
					List<Integer> li = new ArrayList();
					
					
				// TO ADD THE value of list
					li.add(10);
					li.add(44);
					li.add(43);
					li.add(74);
					li.add(77);
					li.add(10);
					System.out.println(li);
					
				List<Integer>l2=new ArrayList<>();
				System.out.println(l2);
				
			//to check the listl2 is empty or not
				boolean empty = l2.isEmpty();
				System.out.println(empty);
				
			// to add the all value from li to l2 list
				
				l2.addAll(li);
				System.out.println(l2);
				
			//to add the some exra value in l2 list
				l2.add(44);
				l2.add(77);
				l2.add(89);
				l2.add(43);
				System.out.println(l2);
				
			//to find the unique value of count
				System.out.println(l2.size()-li.size());
				
			//to remove the common value from li to l2
		//		l2.removeAll(li);
		//		System.out.println(l2);
				
				
		// to get the common value from both the list li and l2
				l2.retainAll(li);
				System.out.println(l2);
				
				
				
		}				
}
