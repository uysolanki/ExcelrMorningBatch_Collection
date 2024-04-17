package day24.collection;

import java.util.Comparator;

import day26.collection.vector.Student;

public class PercentageComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getPer() == s2.getPer())
			return 0;
			else if (s1.getPer() < s2.getPer())
				return 1;
			else
				return -1;
	}

	

}
