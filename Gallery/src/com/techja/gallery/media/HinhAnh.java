package com.techja.gallery.media;

public class HinhAnh extends Media {
	private String loaiAnh, doPhanGiai;

	public void nhapGT(String iD, String ten, String size, String loaiAnh, String doPhanGiai) {
		nhapGT(iD, ten, size);
		this.loaiAnh = loaiAnh;
		this.doPhanGiai= doPhanGiai;
	}
	public void inRa() {
		super.inTT();
		System.out.println("Loai anh la: "+loaiAnh);
		System.out.println("Do phan giai la: "+doPhanGiai);
	}
	
	
}
