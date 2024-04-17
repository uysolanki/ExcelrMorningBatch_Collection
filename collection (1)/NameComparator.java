package day24.collection;

import java.util.Comparator;

import day26.collection.vector.Student;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getSname().compareTo(s2.getSname());
	}

}
