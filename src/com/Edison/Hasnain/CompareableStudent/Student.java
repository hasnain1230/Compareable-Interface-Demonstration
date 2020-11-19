package com.Edison.Hasnain.CompareableStudent;

public class Student implements Comparable<Student> { // Implements Comparable Interface With Generic Student Type
	
	private String firstName, lastName, address; // Instance Variables
	private double GPA;
	
	public Student(String firstName, String lastName, String address, double GPA) { // Constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.GPA = GPA;
	}
	
	public String getFirstName() { // Returns firstName
		return this.firstName;
	}
	
	public String getLastName() { // Returns lastName
		return this.lastName;
	}
	
	public String getAddress() { // Returns Address
		return this.address; 
	}
	
	public double getGPA() { // Returns GPA
		return this.GPA;
	}
	
	public int compareTo(Student obj) { // Comparable Interface
		if (obj.getFirstName().equals(this.firstName)) { // If obj.firstName() is equal to firstName of this class, return0
			return 0;
		}
		else { // Otherwise, return -1.
			return -1;
		}
	}
	
	public String toString() { // toString() method.
		return "Student:\n" + this.firstName + " " + this.lastName + "\n" + this.address + "\n" + GPA; // Probably could have used String formatting. It was a long time ago!
	}
}
