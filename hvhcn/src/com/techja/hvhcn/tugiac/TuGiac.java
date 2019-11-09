package com.techja.hvhcn.tugiac;

import com.techja.hvhcn.dinh.Dinh;

public abstract class TuGiac {
	protected Dinh d1, d2, d3, d4;
	protected double chuVi, dienTich, dDC;

	public void tinhDoDaiCanh(Dinh d1, Dinh d2) {
		double x1 = d1.getX();
		double x2 = d2.getX();
		double y1 = d1.getY();
		double y2 = d2.getY();
		dDC = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public void nhapGT(Dinh d1, Dinh d2, Dinh d3, Dinh d4) {
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.d4 = d4;
	}

	protected abstract void tinhChuVi();

	protected abstract void tinhDienTich();

	protected void inTT() {
		d1.inGT();
		d2.inGT();
		d3.inGT();
		d4.inGT();
	}

}
