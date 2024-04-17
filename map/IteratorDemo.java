package day27.collection.map;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> students=new LinkedList();
		students.add("Alice");
		students.add("Ben");
		students.add("Chris");
		students.addFirst("Abhay");
		students.addLast("Dom");
		students.add(2, "Bharat");
		
//		Iterator<String> list=students.iterator();
//		while(list.hasNext())
//			System.out.println(list.next());
		
		ListIterator<String> list=students.listIterator();
		while(list.hasNext())
			System.out.println(list.next());
		
		System.out.println("============");
		while(list.hasPrevious())
			System.out.println(list.previous());

	}

}
