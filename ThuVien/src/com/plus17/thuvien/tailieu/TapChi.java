package com.plus17.thuvien.tailieu;

public class TapChi extends TaiLieu {
	private String soPhatHanh, thangPhatHanh;

	public TapChi(String maTaiLieu, String tenNXB, String soPhatHanh, String soPhatHanh2, String thangPhatHanh) {
		super(maTaiLieu, tenNXB, soPhatHanh);
		soPhatHanh = soPhatHanh2;
		this.thangPhatHanh = thangPhatHanh;
	}

}
