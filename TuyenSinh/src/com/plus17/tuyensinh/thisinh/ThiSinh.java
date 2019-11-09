package com.plus17.tuyensinh.thisinh;

public abstract class ThiSinh {
	private String sBD, hoTen, diaChi, uuTien;

	protected ThiSinh(String sBD, String hoTen, String diaChi, String uuTien) {
		super();
		this.sBD = sBD;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.uuTien = uuTien;
	}
}
