package com.techja.gallery.media;

public abstract class Media {
	protected String iD, ten, size;

	protected void nhapGT(String iD, String ten, String size) {
		this.iD = iD;
		this.ten = ten;
		this.size = size;
	}

	protected void inTT() {
		System.out.println("ID la: " + iD + "\nTen la: " + ten + "\nSize la :" + size);
	}

	public String getiD() {
		return iD;
	}
}
