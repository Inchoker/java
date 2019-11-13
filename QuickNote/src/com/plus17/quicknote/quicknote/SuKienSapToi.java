package com.plus17.quicknote.quicknote;

public abstract class SuKienSapToi extends GhiChu {
	private String thoiGianBaoThuc,amThanhBaoThuc,xacNhanThamGia,soLanBaoThuc;

	public SuKienSapToi(String maGhiChu, String tieuDe, String noiDung, String thoiGian, String diaDiem,
			String thoiGianBaoThuc, String amThanhBaoThuc, String xacNhanThamGia, String soLanBaoThuc) {
		super(maGhiChu, tieuDe, noiDung, thoiGian, diaDiem);
		this.thoiGianBaoThuc = thoiGianBaoThuc;
		this.amThanhBaoThuc = amThanhBaoThuc;
		this.xacNhanThamGia = xacNhanThamGia;
		this.soLanBaoThuc = soLanBaoThuc;
	}

	

	
	
	
	

}
