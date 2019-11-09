package com.techja.hvhcn.tugiac;

public class HinhChuNhat extends TuGiac {

	@Override
	public void tinhChuVi() {
		// TODO Auto-generated method stub
		tinhDoDaiCanh(d1, d2);
		double dDC1 = dDC;
		tinhDoDaiCanh(d3, d2);
		double dDC2 = dDC;
		tinhDoDaiCanh(d3, d4);
		double dDC3 = dDC;
		tinhDoDaiCanh(d1, d4);
		double dDC4 = dDC;
		chuVi = dDC1 + dDC2 + dDC3 + dDC4;

	}

	@Override
	public void tinhDienTich() {
		tinhDoDaiCanh(d1, d2);
		double dDC1 = dDC;
		tinhDoDaiCanh(d3, d2);
		double dDC2 = dDC;
		dienTich = dDC1*dDC2;
	}
	public void inTT() {
		super.inTT();
		System.out.println("Chu Vi HCN la"+chuVi+"\nDien Tich HCN la"+ dienTich );
	}
	

}
