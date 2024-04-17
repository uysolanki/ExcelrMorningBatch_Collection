package day26.collection.vector;

public class Student implements Comparable<Student> 
{
	private int rno;
	private String sname;
	private double per;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public Student() {
	}

	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

//	@Override
//	public int compareTo(Student temp) {
//		if (per == temp.per)
//			return 0;
//		else if (per < temp.per)
//			return -1;
//		else
//			return 1;
//	}
//	
//	@Override
//	public int compareTo(Student temp) {
//		if (rno == temp.rno)
//			return 0;
//		else if (rno > temp.rno)
//			return 1;
//		else
//			return -1;
//	}
	
	@Override
	public int compareTo(Student temp) {
		return (sname.compareTo(temp.sname));
	}

}
