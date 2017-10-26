package co.edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Point{
	
}

public class CollectionsInJava {

	public static void main(String[] args) {
		
		// Raw Type -> Add any type of Object
		ArrayList list1 = new ArrayList(); // Direct Object Construction
		List list2 = new ArrayList(); 	   // Polymorphic Statement	
		
		// List is Containing hetrogeneous Objects
		
		// Add the data on ArrayList
		list1.add(10); // list1.add(new Integer(10));			| 0th index
		list1.add(new Integer(100));
		list1.add("John");
		list1.add("Jennie");
		list1.add(2.2f); // list1.add(new Float(2.2f));
		list1.add(new Point());								//  | n-1 index
		
		System.out.println("list1 is: "+list1);
		
		// Generic Type | Homogeneous
		ArrayList<String> list3 = new ArrayList<String>();
		ArrayList<Point> list4 = new ArrayList<Point>();
		
		list3.add("John");		// 0
		list3.add("Jennie");
		list3.add("Jack");
		list3.add("Jim");
		list3.add("Joe");		// n-1
		
		System.out.println("list3 is: "+list3);
		
		Point p1 = new Point();
		
		//list3.add(p1); // error
		//list3.add(10); // error
		
		list4.add(p1);
		//list4.add("Jennie"); error
		//list4.add(10); error
		
		// Size of List
		int size1 = list1.size();
		int size3 = list3.size();
		
		System.out.println("size1 is: "+size1);
		System.out.println("size3 is: "+size3);
		
		// Get the Object from List
		String str = list3.get(1);
		System.out.println("str is: "+str);
		
		Object o = list1.get(3);
		System.out.println("o is: "+o); 
		
		// Remove the Object
		list3.remove(1);
		System.out.println(list3);
		
		// Update the Object
		list3.set(1, "Jack Watson");
		System.out.println(list3);
		
		// Check the Object
		if(list3.contains("John")){
			System.out.println("John is in the list");
		}
		
		// Read All Operation i.e Iterating into a list
		
		System.out.println("=========1.For Loop============");
		for(int i=0;i<list3.size();i++){
			System.out.println(list3.get(i));
			//list3.remove(i);
		}
		
		System.out.println("=========2.Enhanced For Loop============");
		for(String s : list3){
			System.out.println(s);
		}
		System.out.println("===============");
		for(Object o1 : list1){
			System.out.println(o1);
		}
		
		System.out.println("=========3.Iterator============");
		Iterator<String> itr = list3.iterator();
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
			
			if(s.equals("John"))
				itr.remove(); // Remove John from List
			
		}
		System.out.println("===============");
		Iterator<Object> itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object o1 = itr1.next();
			System.out.println(o1);
		}
		System.out.println("=========4.ListIterator============");
		ListIterator<String> litr = list3.listIterator();
		while(litr.hasNext()){
			String s = litr.next();
			System.out.println(s);
		}
		System.out.println("===============");
		while(litr.hasPrevious()){
			String s = litr.previous();
			System.out.println(s);
		}
		
		System.out.println("=========5.Enumeration============");
		Enumeration<String> enRef = Collections.enumeration(list3);
		while(enRef.hasMoreElements()){
			String s = enRef.nextElement();
			System.out.println(s);
		}
		
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("Kim");
		list5.add("Kane");
		list5.add("Kaka");
		
		list3.addAll(list5);
		
		System.out.println(list3);
	}

}
