package com.techja.hvhcn.tugiac;

public class HinhVuong extends TuGiac {

	@Override
	public void tinhChuVi() {
		chuVi = 4 * dDC;
	}

	@Override
	public void tinhDienTich() {
		dienTich = Math.pow(dDC, 2);
	}

	@Override
	public void inTT() {
		super.inTT();
		System.out.println("Do dai canh la" + dDC + "\nChu Vi La" + chuVi + "\nDien Tich La:" + dienTich);
	}

}
