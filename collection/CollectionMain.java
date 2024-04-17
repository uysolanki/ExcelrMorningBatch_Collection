package day23.collection;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		ArrayList<Student> fybatch = new ArrayList();
		fybatch.add(new Student(101, "Alice", 78.5));
		fybatch.add(new Student(102, "Ben", 88.5));
		fybatch.add(new Student(103, "Chris", 98.5));
		fybatch.add(new Student(104, "Dom", 93.5));
		fybatch.add(new Student(105, "Elcid", 76.6));
		
		ArrayList<Student> sybatch = new ArrayList();
		sybatch.add(new Student(201, "Frank", 78.5));
		sybatch.add(new Student(202, "George", 88.5));
		sybatch.add(new Student(203, "Henry", 98.5));
		sybatch.add(new Student(204, "Ian", 93.5));
		sybatch.add(new Student(205, "Jack", 76.6));
		
		ArrayList<Student> tybatch = new ArrayList();
		tybatch.add(new Student(301, "King", 78.5));
		tybatch.add(new Student(302, "Lima", 88.5));
		tybatch.add(new Student(303, "Mike", 98.5));
		tybatch.add(new Student(304, "Nancy", 93.5));
		tybatch.add(new Student(305, "Orion", 76.6));
	
	
		
		ArrayList<ArrayList<Student>> college1=new ArrayList();
		college1.add(fybatch);
		college1.add(sybatch);
		college1.add(tybatch);
		
		//System.out.println(college);
		System.out.println(college1.size());
		
		int i=0;
		while(i<college1.size())
		{
			ArrayList<Student> yearwise=college1.get(i);  //yearwise fystudents 
			
			int maxIndex=0;		//maxIndex=2
			double maxPercentage=yearwise.get(0).getPer();   //98.5
			int j=0;											 //i=5
			while(j<yearwise.size())
			{		//76.6
				if(yearwise.get(j).getPer() > maxPercentage)
				{
					maxPercentage=yearwise.get(j).getPer();
					maxIndex=j;
				}
			j++;
			}
			System.out.print("Topper Name of " + (i+1) + "Year is "+ yearwise.get(maxIndex).getSname());
			System.out.println("Topper Percentage of" + (i+1) + "Year is "+ maxPercentage);
			
		i++;	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//System.out.println(morningbatch);
//		
//		int maxIndex=0;		//maxIndex=2
//		double maxPercentage=morningbatch.get(0).getPer();   //98.5
//		int i=0;											 //i=5
//		while(i<morningbatch.size())
//		{		//76.6
//			if(morningbatch.get(i).getPer() > maxPercentage)
//			{
//				maxPercentage=morningbatch.get(i).getPer();
//				maxIndex=i;
//			}
//		i++;
//		}
//		System.out.println("Topper Name "+ morningbatch.get(maxIndex).getSname());
//		System.out.println("Topper Percentage "+ maxPercentage);
//		
		
	}

}
