package org.college;

public class Student extends College {
	
	public void studentName() {
		System.out.println("KARTHIK");
	}
	public void studentDept() {
		System.out.println("Computer science");
	}
	public void studentId() {
		System.out.println("1234");
	}
	
	public static void main(String[] args) {
	Student details=new Student();
	details.studentName();
	details.studentId();
	details.studentDept();
	details.CollegeName();
	details.CollegeCode();
	details.CollegeRank();
	Department info=new Department();
	info.deptName();


	}

}
