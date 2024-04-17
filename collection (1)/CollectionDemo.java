package day24.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import day26.collection.vector.Student;


public class CollectionDemo {

	public static void main(String[] args) {
	
//		int arr[]= {10,50,40,20,30};
//		int search=70;
//		int i;
//		for(i=0;i<arr.length;i++)
//		{
//			if(arr[i]==search)
//			{
//				System.out.println("Found");
//				break;
//			}
//		}
//		if(i==arr.length)
//			System.out.println("Not Found");
//
		
		
//		ArrayList numbers=new ArrayList(Arrays.asList(10,20,30,40,50));
//		int search=30;
//		if(numbers.contains(search))
//			System.out.println("Found");
//		else
//			System.out.println("Not Found");
		
		
		
		
//		String names[]= {"Alice","Tom","Chris","Frank","Ben"};
//		String searchname="Tot";
//		
//		int i;
//		for(i=0;i<names.length;i++)
//		{
//			if(names[i].equals(searchname))
//			{
//				System.out.println("Found");
//				break;
//			}
//		}
//		if(i==names.length)
//			System.out.println("Not Found");
		
		
//		ArrayList<String> names=new ArrayList(Arrays.asList("Alice","Tom","Chris","Frank","Ben"));
//		String searchname="Tom";
//		if(names.contains(searchname))
//			System.out.println("Found");
//		else
//			System.out.println("Not Found");
//		
		
		
//		int arr[]= {7,5,9,3,4};
//		System.out.println("Before Sorting "+Arrays.toString(arr));
//		int i,j,temp;
//		
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=0; j<arr.length-1-i;j++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		System.out.println("After  Sorting "+Arrays.toString(arr));
		
//		ArrayList numbers=new ArrayList(Arrays.asList(7,5,9,3,4));
//		System.out.println("Before Sorting "+numbers);
//		Collections.sort(numbers);
//		System.out.println("After Sorting "+numbers);
		
		ArrayList<Student> fybatch = new ArrayList();
		fybatch.add(new Student(101, "Ritesh", 78.5));
		fybatch.add(new Student(104, "Krushna", 88.5));
		fybatch.add(new Student(103, "Aditya", 98.5));
		fybatch.add(new Student(105, "Ashish", 93.5));
		fybatch.add(new Student(102, "Kedar", 76.6));
		
		System.out.println("Before  Sorting ");
		for(Student s:fybatch)
			System.out.println(s);
		
		
		Collections.sort(fybatch,new NameComparator());
		System.out.println("=======================Attendance of Mach 2024=====================");
		//System.out.println("After  Sorting ");
		for(Student s:fybatch)
			System.out.println(s.getSname());
		
		Collections.sort(fybatch,new PercentageComparator());
		System.out.println("=======================Sem 1 Rankers List=====================");
		System.out.println("Name   Percentage");
		//System.out.println("After  Sorting ");
		for(Student s:fybatch)
			System.out.println(s.getSname() + " " +s.getPer());
		
		
}

}
