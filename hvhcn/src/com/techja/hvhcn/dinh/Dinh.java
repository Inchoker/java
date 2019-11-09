package com.techja.hvhcn.dinh;

public class Dinh {
	private int x, y;

	public void nhapGT(int gTX, int gTY) {
		this.x = gTX;
		this.y = gTY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void inGT() {
		System.out.println("Dinh la"+"("+x+","+y+")");
	}
}
