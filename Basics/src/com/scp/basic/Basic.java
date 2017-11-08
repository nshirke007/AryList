package com.scp.basic;

public class Basic {
	int a = 50;
	int b = 100;
	static int s = 30;
	
	
	 
	/*
	 * for final keyword 1.if final keyword used for class then we can't extends
	 * that class 2.if final keyword used for method then we can't override that
	 * method 3.if variable is final then whole excetion variable value is final
	 * 
	 */

	/*
	 * 1.using this keyword we can access same class filed,methods 2.using super
	 * keyword we can access parent class filed and methods. 3.we can't use
	 * super and this keyword in static blocks. 4.super and this keyword should
	 * be first in constructor
	 */
	static {
		System.out.println("this is static block in basic class");
	}
	{
		System.out.println("this is instance block in basic class");
	}
	
	
	/*
	 *super(); is not allowed in method 
	 */
	void MethodOne(int a, int b) {
		
		System.out.println(a);
		int A = this.a;
		System.out.println(A);
		System.out.println("methodone in basic class");
	}

	void MethodTwo() {
		this.PrivateMethod();
		System.out.println("methodtwo in basic class");
	}

	private void PrivateMethod() {
		System.out.println("this is private methd in supper class");
	}
}

class BasicNew extends Basic {
	static {
		System.out.println("this is static block in child class ");
	}
	{
		System.out.println("this is instance block in chlid class ");
	}

	static void Methodthree() {
		System.out.println("methodthree in subclass");
	}
}

/*
 * 1.using child object we can access parent and child methods 2.using parent
 * object we can access only parent method
 */

/*
 * 1.static block executed first then instance blocks are executed
 */

/*
 * object creation 
 * 1.using new oprator
 * 2.using clone()
 * 3.using newinstance()
 * 4.using deseriallization
 * 5.creating string and array object 
 */
class MainClass {
	public static void main(String[] args) {

		BasicNew objNew = new BasicNew();
		objNew.MethodOne(40, 30);
		final Basic obj = new Basic();
		obj.MethodOne(20, 90);
		objNew = new BasicNew();
//		obj = new Basic();
		

		/*
		 * if object is final then we can't re-assign new object to that referance
		 */
	}

	static {
		System.out.println("this is static block in main method");
	}
	{
		System.out.println("this is instace block in main method");
	}
}
