package com.techja.hvhcn.main;

import com.techja.hvhcn.dinh.Dinh;
import com.techja.hvhcn.tugiac.HinhChuNhat;
import com.techja.hvhcn.tugiac.HinhVuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhVuong hv = new HinhVuong();
		Dinh d1 = new Dinh();
		Dinh d2 = new Dinh();
		Dinh d3 = new Dinh();
		Dinh d4 = new Dinh();
		d1.nhapGT(0, 0);
		d2.nhapGT(0, 2);
		d3.nhapGT(2, 2);
		d4.nhapGT(2, 0);
		hv.nhapGT(d1, d2, d3, d4);
		hv.tinhDoDaiCanh(d1, d2);
		hv.tinhChuVi();
		hv.tinhDienTich();
		hv.inTT();
		Dinh d5 = new Dinh();
		Dinh d6 = new Dinh();
		d5.nhapGT(4, 2);
		d6.nhapGT(4, 0);
		HinhChuNhat hCN= new HinhChuNhat();
		hCN.nhapGT(d1, d2, d5, d6);
		hCN.tinhChuVi();
		hCN.tinhDienTich();
		hCN.inTT();
	}
	

}
