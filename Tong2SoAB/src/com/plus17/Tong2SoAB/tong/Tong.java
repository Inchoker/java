package com.plus17.Tong2SoAB.tong;

public class Tong {
	private double a,b,tong;
	public void nhapGT(int a, int b) {
		this.a= a;
		this.b=b;
	}
	public void tinhTong() {
		tong = a+b;
	}
	public void in() {
		System.out.println(tong);
	}
}
