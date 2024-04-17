package day26.collection.vector;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	Set<Student> lhs=new TreeSet<Student>();
	lhs.add(new Student(101,"Alice",78.5));
	lhs.add(new Student(103,"Dom",68.5));
	lhs.add(new Student(105,"Chris",48.5));
	lhs.add(new Student(104,"Elcid",98.5));
	lhs.add(new Student(102,"Ben",99.5));
	
	System.out.println(lhs);
}
}
