import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;


public class Collections {

	void queueDemo(){
		
		//PriorityQueue queue = new PriorityQueue();
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i); //queue.add(new Integer(i)); | AutoBoxing Happens in background
		}
		// 10 9 8 7 6 5 4 3 2 1   | 10 is head and 1 is tail
		// PrioirityQueue will sort the data
		// 1 2 3 4 5 6 7 8 9 10   | 1 is head and 10 is tail
		System.out.println("Head is: "+queue.peek()); // Retrieve the head
	
		System.out.println("queue size is: "+queue.size());
		
		for(int i=0;i<10;i++){
			System.out.println(queue.poll()); // Retrieve and Remove the head of Queue
		}
	}
	
	void setDemo(){
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("John");
		nameList.add("Jennie");
		nameList.add("Jim");
		nameList.add("John");
		nameList.add("Joe");
		
		// In set no indexing, so cant use loop to iterate
		//Set<String> nameSet = new HashSet<String>();
		//HashSet<String> nameSet = new HashSet<String>();
		
		TreeSet<String> nameSet = new TreeSet<String>(); // SortedSet
		
		nameSet.add("John");
		nameSet.add("Jennie");
		nameSet.add("Jim");
		nameSet.add("John");
		nameSet.add("Joe");
		
		System.out.println("nameList is: "+nameList);
		System.out.println("nameSet is: "+nameSet);
		
		
		Iterator<String> itr = nameSet.iterator();
		while(itr.hasNext()){
			String n = itr.next();
			System.out.println(n);
		}
		System.out.println("=================");
		Enumeration<String> eRef = java.util.Collections.enumeration(nameSet);
		while(eRef.hasMoreElements()){
			String n = eRef.nextElement();
			System.out.println(n);
					
		}
		
		// Comparator | Comparable
	}
	
	void mapDemo(){
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "John");
		map.put(31, "Jennie");
		map.put(117, "Jim");
		map.put(311, "Jack");
		map.put(52, "Joe");
		map.put(117, "Fionna"); // Update 
		map.put(null, "Harry");
		map.put(159, null);
		
		System.out.println("map is: "+map);
		
		// Reading the Value
		String s = map.get(101);
		System.out.println("s is: "+s);
		
		//map.remove(101);
		
		//if(map.containsKey(101))
		//if(map.containsValue("Fionna"))
		
		//Iterate in Map
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+" - "+value);
		}
		
		System.out.println("==================");
		// EntrySet (KeyValue Pair)
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		System.out.println("===========");
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(31, "Jennie");
		table.put(117, "Jim");
		table.put(311, "Jack");
		table.put(52, "Joe");
		table.put(117, "Fionna"); // Update 
		//table.put(null, "Harry");
		//table.put(159, null);
		System.out.println("HashTable: "+table);
	}
	
	
	public static void main(String[] args) {
		
		Collections c = new Collections();
		//c.queueDemo();
		//c.setDemo();
		c.mapDemo();

	}

}
