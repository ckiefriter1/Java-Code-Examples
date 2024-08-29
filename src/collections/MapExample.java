package collections;

import java.util.*;

public class MapExample {
	 public static void main(String args[]){  
		  Map<Integer,String> map = new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");
		  map.put(103,"Chuck");
		  map.put(104,"Chuck");
		  map.put(105,"Mary");
		  map.put(105,"Bill");
		  
		  displayMapContents(map);
		   
		  System.out.println("-----------------------------------");
		  System.out.println("The value for Key 101 = " + map.get(101));
		  System.out.println("This map has " + map.size() + " entries");
		  System.out.println("Hashcode for this map = " + map.hashCode());
		  System.out.println("containsKey(110) = " + map.containsKey(110));
		  System.out.println("containsValue(Chuck) = " + map.containsValue("Chuck"));
		  map.replace(102, "Anna");
		  System.out.println("The value for Key 102 after replacement = " + map.get(102));
		  System.out.println("The value for Key 107 (not in the Map) = " + map.getOrDefault(107, "No value entry for this key"));
		  
		  System.out.println("-----------------------------------");
		  map.remove(103);
		  displayMapContents(map);
	 }

	private static void displayMapContents(Map<Integer, String> map) {
		//Elements can traverse in any order  
		System.out.println("Key Value");
		System.out.println("--- -------");
		for(Map.Entry<Integer,String> m:map.entrySet()){  
		   System.out.println(m.getKey()+ " " + m.getValue());  
		}
		
	}  
}
