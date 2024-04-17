package day27.collection.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> employees=new HashMap();
		employees.put("Alice",111);
		employees.put("Ben",201);
		employees.put("Chris",123);
		
		System.out.println(employees);
		
		Set<String> keys=(Set) employees.keySet();
		for(String k:keys)
			System.out.println(k);
		
		

	}

}
