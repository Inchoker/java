package com.plus17.quanlymonphai.kynang;

public abstract class KyNang {
	private String tenKyNang, satThuong, thuocTinh, moTa;

	protected KyNang(String tenKyNang, String satThuong, String thuocTinh, String moTa) {
		super();
		this.tenKyNang = tenKyNang;
		this.satThuong = satThuong;
		this.thuocTinh = thuocTinh;
		this.moTa = moTa;
	}

	protected void inTT() {
		// syso ky nang
	}
}
