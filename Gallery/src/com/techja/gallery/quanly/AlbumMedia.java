package com.techja.gallery.quanly;

import com.techja.gallery.media.HinhAnh;
import com.techja.gallery.media.Video;

public class AlbumMedia {
	private String ma,ten,ngayTao;
	private HinhAnh dSHA[];
	private Video dSVideo[];
	
	public void nhapGT(String ma, String ten, String ngayTao) {
		this.ma=ma;
		this.ten=ten;
		this.ngayTao= ngayTao;
	}
	public	void themMedia(HinhAnh hinhAnh){
		//them hinhAnh vao dsHinhAnh
	}
	public void themMedia(Video video){
		//them video vao dsVideo
	}
	
	public void suaTenMedia(String gTriId, String tenMoi){
		//Tim kiem trong dsHinhAnh va dsVideo xem co HinhAnh hoac Video nao co id = gTriId thi sua ten = tenMoi
	}
	public void xoaMedia(String gTriId){
		//Tim kiem trong dsHinhAnh va dsVideo xem co HinhAnh hoac Video nao co id = gTriId thi xoa khoi danh sach
	}
	
	public HinhAnh[] timKiemHinhAnh(String gTriTen){
		HinhAnh kq[];
		//Tim kiem trong dsHinhAnh xem co HinhAnh nao co ten = gTriTen thi them vao kq
		
		return kq;
	}
	
	public Video[] timKiemVideo(String gTriTen){
		Video kq[];
		//Tim kiem trong dsVideo xem co Video nao co ten = gTriTen thi them vao kq
		
		return kq;
	}
	
	public void thuPhongHinhAnh(String gTriId){
		//Tim kiem trong dsHinhAnh xem co HinhAnh nao co id = gTriId thi sai HinhAnh->thuPhong()
	}
	
	public void xoayHinhAnh(String gTriId){
		//Tim kiem trong dsHinhAnh xem co HinhAnh nao co id = gTriId thi sai HinhAnh->thuPhong()
	}

	public void playVideo(String gTriId){
		//Tim kiem trong dsVideo xem co Video nao co id = gTriId thi sai Video->playVideo()
	}
	
	public void inTT(){
		//In ra ma, ten, ngayTao
		//Duyet tung HinhAnh trong dsHinhAnh va sai HinhAnh->inTT()
		//Duyet tung Video trong dsVideo va sai Video->inTT()
	}
}
