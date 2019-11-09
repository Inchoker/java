package com.plus17.notedacsan.dacsan;

public class DacSan {
	private String maDS, tenDS, gia, moTa, noiBan, nhanXet;

	public void taoMoiDacSan(String maDS,String tenDS,String gia,String moTa,String noiBan,String nhanXet) {
		this.maDS = maDS;
		this.tenDS=tenDS;
		this.gia=gia;
		this.moTa=moTa;
		this.noiBan=noiBan;
		this.nhanXet=nhanXet;
	}
	public void inDS() {
		System.out.println("Ma Dac San La" +maDS);
		System.out.println("Ten Dac San La" + tenDS);
		System.out.println("Gia Dac San La"+gia);
		System.out.println("Mo Ta Dac San La"+moTa);
		System.out.println("Noi Ban Dac San La"+noiBan);
		System.out.println("Nhan Xet Dac San La"+nhanXet);
	}
	public String getMaDS() {
		return maDS;
	}
	public void setMaDS(String maDS) {
		this.maDS = maDS;
	}
	public String getTenDS() {
		return tenDS;
	}
	public void setTenDS(String tenDS) {
		this.tenDS = tenDS;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getNoiBan() {
		return noiBan;
	}
	public void setNoiBan(String noiBan) {
		this.noiBan = noiBan;
	}
	public String getNhanXet() {
		return nhanXet;
	}
	public void setNhanXet(String nhanXet) {
		this.nhanXet = nhanXet;
	}
	
	
}
