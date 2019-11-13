package com.plus17.quicknote.quicknote;

public abstract class GhiChu {
	private String maGhiChu, tieuDe, NoiDung,thoiGian,diaDiem;

	protected GhiChu(String maGhiChu, String tieuDe, String noiDung, String thoiGian, String diaDiem) {
		super();
		this.maGhiChu = maGhiChu;
		this.tieuDe = tieuDe;
		NoiDung = noiDung;
		this.thoiGian = thoiGian;
		this.diaDiem = diaDiem;
	}

	

}
