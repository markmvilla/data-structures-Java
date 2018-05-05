/*
Data Structures

Author		Mark Villa
Date		April 4, 2018
Website		http://www.markvilla.org
Copyright	2018 Mark Villa.
*/

import java.util.*;  

class Student {
	public int age;
	public String name;
	public boolean isMale;
	Student(int age, String name, boolean isMale){
		this.age = age;
		this.name = name;
		this.isMale = isMale;
	}
}

public class DataStructures {
	public static void main(String[] args) {
		//arrayList();
		//linkedList();
		//hashSet();
		//hashMap();
		//hashTable();
	}
	
	public static void arrayList() {
		/*
		Java ArrayList class can contain duplicate elements.
		Java ArrayList class maintains insertion order.
		Java ArrayList class is non synchronized.
		Java ArrayList allows random access because array works at the index basis.
		In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
		*/
		
		Student s1 = new Student(24,"mark",true);
		Student s2 = new Student(18,"stephany",false);
		Student s3 = new Student(20,"lily",false);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		for(int i = 0; i < students.size(); i++) {
			Student std = students.get(i);
		    System.out.println(std.age+" "+std.name+" "+std.isMale);  
		}
	}
	
	public static void linkedList() {
		/*
		Java LinkedList class can contain duplicate elements.
		Java LinkedList class maintains insertion order.
		Java LinkedList class is non synchronized.
		In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
		Java LinkedList class can be used as list, stack or queue.
		*/
		
		Student s1 = new Student(24,"mark",true);
		Student s2 = new Student(18,"stephany",false);
		Student s3 = new Student(20,"lily",false);
		
		SimpleLinkedList students = new SimpleLinkedList();
		students.addTail(s1);
		students.addTail(s2);
		students.addTail(s3);
		
		Student std = (Student) students.head.next.element;
	    System.out.println(std.name);  
	}
	
	public static void hashSet() {
		/*
		HashSet stores the elements by using a mechanism called hashing.
		HashSet contains unique elements only.
		*/
		
		Student s1 = new Student(24,"mark",true);
		Student s2 = new Student(18,"stephany",false);
		Student s3 = new Student(20,"lily",false);
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(s3);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s3);
		
	    for(Student std:students){
		    System.out.println(std.name);  
		}
	}

	public static void hashMap() {
		/*
		A HashMap contains values based on the key.
		It contains only unique elements.
		It may have one null key and multiple null values.
		It maintains no order.
		*/
		
		Student s1 = new Student(24,"mark",true);
		Student s2 = new Student(18,"stephany",false);
		Student s3 = new Student(20,"lily",false);

		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put(s1.name, s1);
		students.put(s2.name, s2);
		students.put(s3.name, s3);
		students.put(null, null);
		
	    for(HashMap.Entry<String, Student> entry:students.entrySet()) {  
	    	String key = entry.getKey();  
	        Student std = entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(std.name+" "+std.age+" "+std.isMale);   
	    }
	}
	
	public static void hashTable() {
		/*
	  	A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
		It contains only unique elements.
		It may have not have any null key or value.
		It is synchronized.
		*/
		
		Student s1 = new Student(24,"mark",true);
		Student s2 = new Student(18,"stephany",false);
		Student s3 = new Student(20,"lily",false);

		Map<String, Student> students = new Hashtable<String, Student>();
		students.put(s1.name, s1);
		students.put(s2.name, s2);
		students.put(s3.name, s3);
		//students.put(null, null);

		for(Map.Entry<String, Student> entry: students.entrySet()) {
	    	String key = entry.getKey();  
	        Student std = entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(std.name+" "+std.age+" "+std.isMale);
		}
	}
	
}
