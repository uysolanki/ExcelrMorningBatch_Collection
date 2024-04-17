package day26.collection.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet hashset=new HashSet();
//		hashset.add("Alice");
//		hashset.add("Ben");
//		hashset.add("Chris");
//		hashset.add("Dom");
//		hashset.add("Elcid");
//		hashset.add("Ben");
//		hashset.add(null);
//		hashset.add("Elcid");
//		hashset.add("Ben");
//		hashset.add(null);
//		
//		System.out.println(hashset);
		
		
		ArrayList<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,1,2));
//		System.out.println(numbers);
//		HashSet newnumbers=new HashSet(numbers);
//		System.out.println(newnumbers);
		
		HashSet seta=new HashSet(Arrays.asList(1,2,3,4,5));
		HashSet setb=new HashSet(Arrays.asList(4,5,6,7,8));
		System.out.println("SET A : " +seta);
		System.out.println("SET B : " +setb);
		
		
//		seta.addAll(setb);
//		System.out.println("UNION : "+seta);
		
//		seta.retainAll(setb);
//		System.out.println("INTERSECTION : "+seta);
		
		HashSet hs1=new HashSet();//Default capacity 16, default fillratio 0.75
		HashSet hs2=new HashSet(50);//User Defined capacity 16, default fillratio 0.75
		HashSet hs3=new HashSet(50,0.5f);//User Defined capacity 16, default fillratio 0.75
		HashSet hs4=new HashSet(numbers);//Make any collection class object into a hashset
	}

}
