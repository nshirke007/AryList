package com.scp.ary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListNew {

	
	
	public static void main(String[] args) {

		/*
		 * Student [] S={new Student(12, "nitin", 60) ,new Student(13, "rohit",
		 * 70) ,new Student(56, "akash", 40) ,new Student(45, "ganesh", 35)};
		 */
		Student S1 = new Student(12, "nitin", 60);
		Student S2 = new Student(13, "rohit", 70);
		Student S3 = new Student(56, "akash", 40);
		Student S4 = new Student(45, "ganesh", 35);
		Student S5 = new Student(21, "xyz", 50);
		Student S6 = new Student(58, "abc", 80);
		Student S7 = new Student(58, "nitin", 50);
		Student S8 = new Student(42, "ddd", 70);
		List<Student> list = new ArrayList();
		list.add(S1);
		list.add(S2);
		list.add(S3);
		list.add(S4);
		list.add(S5);
		list.add(S6);
		list.add(S7);
		list.add(S8);
		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			itr.next();
			System.out.println(itr.next());
		}
	}

}
