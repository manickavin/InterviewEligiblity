package com.accenture;

public class Eligiblity {

	public static void main(String[] args) {
		System.out.println("\t\tEmployee eligiblity criteria");
		System.out.println("\t\t***********************");
	
		int passedOut= 2020;
		int passedOut1= 2021;
		System.out.println(passedOut + " and " + passedOut1 + " passed out students are eligible");
		
		float cgpa= 7.95f;
		System.out.println("The required cgpa is: " + cgpa);
		
		int salary =25000;
		System.out.println("The monthly salary is: "+ salary);
		
		byte arrear= 2;
		System.out.println("No of arrears are allowed is: " + arrear );
		
		String b = "IT ";
		String b1 = "CSE ";
		String b2 = "ECE ";
		System.out.println("Students from the following background must attend: " +b +b1 +b2 );
		
		char cab = 'y'; 
		//y is yes
		System.out.println("Does student from other backgroud can also attend: " + cab);
		
		System.out.println("\n\t\tThe following is the selected student details");
		System.out.println("\t\t===============================================");
		
		StudentDetails d = new StudentDetails();
		d.details();
		
		System.out.println("now this is branch A");
		}
}
