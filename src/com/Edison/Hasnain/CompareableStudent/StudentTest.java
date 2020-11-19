package com.Edison.Hasnain.CompareableStudent;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Hasnain", "Ali", "JPS Address", 1.0); // Object Instantiation and Initialization
		Student s2 = new Student("Smart", "Boi", "JPS Address", 4.33);
		Student s3 = new Student("Hasnain", "Ali", "JPS Address", 1.0);
		
		System.out.println(s1.compareTo(s2)); // Using Comparable (returns -1)
		System.out.println(s1.compareTo(s3)); // Returns 0 since they are equal. 
		
		System.out.println(s1); // Calls toString of s1
	}

}
