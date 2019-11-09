package com.plus17.giaiphuongtrinhbac2.main;

import java.util.Scanner;

import com.plus17.giaiphuongtrinhbac2.phuongtrinh.PhuongTrinh;

public class Main {

	public static void main(String[] args) {
Scanner newScan = new Scanner(System.in);

		while (true) {
			System.out.println("nhap a");
			double a = newScan.nextDouble();
			System.out.println("nhap b");
			double b = newScan.nextDouble();
			System.out.println("nhap c");
			double c = newScan.nextDouble();
			PhuongTrinh pT = new PhuongTrinh(a, b, c);
			pT.giaiPT();
			
		}
		
	}

}
