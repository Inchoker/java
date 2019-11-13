package com.plus17.quicknote.quicknote;

public abstract class SuKienDaQua extends GhiChu{
	private String tenNgLienQuan,ketQua,danhGia;

	public SuKienDaQua(String maGhiChu, String tieuDe, String noiDung, String thoiGian, String diaDiem,
			String tenNgLienQuan, String ketQua, String danhGia) {
		super(maGhiChu, tieuDe, noiDung, thoiGian, diaDiem);
		this.tenNgLienQuan = tenNgLienQuan;
		this.ketQua = ketQua;
		this.danhGia = danhGia;
	}


	

}
