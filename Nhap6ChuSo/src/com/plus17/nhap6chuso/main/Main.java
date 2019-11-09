package com.plus17.nhap6chuso.main;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Nhap so a");
	String a = scan.nextLine();
	System.out.println("Nhap so b");
	
	String b = scan.nextLine();
	System.out.println("Nhap so c");
	
	String c = scan.nextLine();
	System.out.println("Nhap so d");
	
	String d = scan.nextLine();
	System.out.println("Nhap so e");
	String e = scan.nextLine();
	System.out.println("Nhap so f");
	String f = scan.nextLine();
	String stringOne= a+b+c+d+e+f;
	String stringTwo=f+e+d+c+b+a;
	if (stringOne==stringTwo) {
		System.out.println("La so thuan nghich");
	}else {
		System.out.println("Khong la so thuan nghich");
	}
	scan.close();
}
}
