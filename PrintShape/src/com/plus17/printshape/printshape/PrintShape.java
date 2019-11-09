package com.plus17.printshape.printshape;

public class PrintShape {
	private int n;

	public PrintShape(int n) {
		super();
		this.n = n;
	}
public void printShape() {
	String str="";
	for (int i=1;i<n;i++) {
		for(int k=1;k<n;k++) {
			str+=" ";
		}
		str+=i;
	}
}
