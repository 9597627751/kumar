package org.login;

import java.util.*;

public class Arraylist1 {
	
	public static void main(String[] args) {
	
// integer
	
				
				List<Integer> li = new ArrayList<>();
				
				
			// TO ADD THE value of list
				li.add(10);
				li.add(44);
				li.add(43);
				li.add(74);
				li.add(77);
				li.add(10);
				System.out.println(li);
				
			//to find the length of the list
				int size = li.size();
				System.out.println(size);
				
			//to get a particular value for a given index
				Object object = li.get(3);
				System.out.println(object);
				
			//to remove a particular value for for the list
				li.remove(2);
				System.out.println(li);
				
			// index based add
				li.add(3, 300);
				System.out.println(li);
				
			//to replace the particular value
				li.set(4, 400);
				System.out.println(li);
				
			
			//to check the particular value preset or not
				boolean contains = li.contains(10);
				System.out.println(contains);
				
			//to find the index position of particular list
				int indexOf = li.indexOf(10);
				System.out.println(indexOf);
				
				int lastIndexOf = li.lastIndexOf(10);
				System.out.println(lastIndexOf);
				
				int indexOf2 = li.indexOf(100);
		        System.out.println(indexOf2);
		        
		      System.out.println("=============================");
		      
		    //to iterae the list
		      
		      System.out.println("for  loop");
		      
		      for (int i = 0; i < (li.size()); i++) {
		    	  System.out.println(li.get(i));
				
			}

				System.out.println("=======================");
				
				System.out.println("enhanced for loop");
				
				for (Object j : li) {
					System.out.println(j);
					
				}
				
				
				
				
				
			}
			

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	



