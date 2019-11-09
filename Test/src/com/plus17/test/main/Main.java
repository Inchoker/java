package com.plus17.test.main;

import com.plus17.test.test.Son;

public class Main {
	public static void main(String[] arg) {
		Son son = new Son();
		son.setID(10);
		int a = son.getID();
		System.out.println(a);
	}
}
