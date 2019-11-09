package com.techjs.truyencuoi.truyencuoi;

public class TruyenCuoi {
	private String tenTruyen, nhaXuatBan, noiDungTruyen, iDTruyen;

	public void nhapGT(String gTIDTruyen,String gTtenTruyen, String gTnhaXuatBan, String gTnoiDungTruyen, int gTIDTruyen) {
		tenTruyen = gTtenTruyen;
		nhaXuatBan = gTnhaXuatBan;
		noiDungTruyen = gTnoiDungTruyen;
		iDTruyen = gTIDTruyen;
	}

	public void hienThiTruyen() {
		// noi dung phuong thuc
	}

	public void inTT() {
		System.out.println("Ten truyen la: " + tenTruyen);
		System.out.println("Nha Xuat Ban la: " + nhaXuatBan);
		System.out.println("Noi Dung truyen la: " + noiDungTruyen);
		System.out.println("ID truyen la: " + iDTruyen);
	}
}
