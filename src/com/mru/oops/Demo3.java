package com.mru.oops;

public class Demo3 {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		Test11 obj1 = adapter.getInstance1();
		String result1 = obj1.msg;
		System.out.println(result1);
		obj1.m1();
		
		Test12 obj2 = adapter.getInstance2();
		String result2 = obj2.msg;
		System.out.println(result2);
		obj2.m2();
		
	}
}




