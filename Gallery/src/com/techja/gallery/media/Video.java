package com.techja.gallery.media;

public class Video extends Media {
	private String loaiVideo, thoiLuong;

	public void nhapGT(String iD, String ten, String size, String loaiVideo, String thoiLuong) {
		nhapGT(iD, ten, size);
		this.loaiVideo = loaiVideo;
		this.thoiLuong = thoiLuong;
	}
	public void inRa() {
		this.inTT();
		System.out.println("Loai Video la: "+ loaiVideo);
		System.out.println("Thoi Luong cua Video la: "+thoiLuong);
	}

}
