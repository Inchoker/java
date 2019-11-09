package com.techja.gallery.quanly;

public class NguoiDung {
	// Khai bao thuoc tinh
	private AlbumMedia dsAlbum[];

	public void taoAlbum(AlbumMedia album) {
		// Dua album vao dsAlbum
	}

	public void suaTenAlbum(String gTriMa, String tenMoi) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sua ten =
		// tenMoi
	}

	public void hienThiAlbum() {
		// Duyet tung AlbumMedia trong dsAlbum, sai tung AlbumMedia->inTT()
	}

	public void themMediaVaoAlbum(String gTriMa, Video video) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sai
		// AlbumMedia->themMedia(video)
	}

	public void themMediaVaoAlbum(String gTriMa, HinhAnh hinhAnh) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sai
		// AlbumMedia->themMedia(hinhAnh)
	}

	public void xoaMediaKhoiAlbum(String gTriMa, String gTriId) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sai
		// AlbumMedia->xoaMedia(gTriId)
	}

	public void xoaAlbum(String gTriMa) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi xoa khoi danh
		// sach
	}

	public AlbumMedia[] timKiemAlbum(String gTriTen) {
		AlbumMedia kq[];
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ten = gTriTen thi them vao kq

		return kq;
	}

	public void thuPhongHinhAnh(String gTriMa, String gTriId) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sai
		// AlbumMedia ->thuPhongHinhAnh(gTriId)
	}

	public void xoayHinhAnh(String gTriMa, String gTriId) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sai
		// AlbumMedia ->xoayHinhAnh(gTriId)
	}

	public void playVideo(String gTriMa, String gTriId) {
		// Tim kiem trong dsAlbum xem co AlbumMedia nao co ma = gTriMa thi sai
		// AlbumMedia ->playVideo(gTriId)
	}
}
