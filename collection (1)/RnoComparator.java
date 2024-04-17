package day24.collection;

import java.util.Comparator;

import day26.collection.vector.Student;

public class RnoComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getRno() == s2.getRno())
		return 0;
		else if (s1.getRno() > s2.getRno())
			return 1;
		else
			return -1;
	}

}
