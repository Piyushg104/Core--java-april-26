package com;

public class Test {

	public static void main(String[] args) {

		TwoClass T = new TwoClass();

		System.out.println("Student Details are:");
		System.out.println(T.studentname);
		System.out.println(T.City);
		System.out.println(T.MobileNo);
		System.out.println(T.rollno);

		TwoClass T2 = new TwoClass();
		T2.studentname = "abhishek";
		T2.City = "Pune";
		T2.MobileNo = 24555;
		T2.rollno = 111;

		System.out.println("T2 Student Details are:");
		System.out.println(T2.studentname);
		System.out.println(T2.City);
		System.out.println(T2.MobileNo);
		System.out.println(T2.rollno);

		
		TwoClass T3= new TwoClass();
		
		T3.studentname= "Rohit";
		T3.MobileNo=1234;
		T3.City= "Nagpur";
		T3.rollno= 1007;
		
		System.out.println("T3 Student Details are:");
		System.out.println(T3.studentname);
		System.out.println(T3.MobileNo);
		System.out.println(T3.City);
		System.out.println(T3.rollno);

		
		
		
	}

}
