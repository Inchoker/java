package com.plus17.quicknote.main;

import com.plus17.quicknote.quicknote.GhiChu;
import com.plus17.quicknote.quicknote.SuKienDaQua;
import com.plus17.quicknote.quicknote.SuKienSapToi;

public class QuanLy {
	private GhiChu dsGhiChu[];

	public QuanLy(GhiChu[] dsGhiChu) {
		super();
		this.dsGhiChu = dsGhiChu;
	}
	public void taoGhiChu(GhiChu gChu) {
		if (gChu instanceof SuKienDaQua) {
			//add them su kien da qua
		}else if(gChu instanceof SuKienSapToi) {
			//add them su kien sap toi
		}else {
			//nhap sai roi, hay nhap lai
		}
	}
	public void xoaGhiChu(GhiChu gChu) {
		//xoa ghi chu
	}
	public void timKiemGhiChu(String tenGhiChu) {
		//tim kiem ghi chu theo ten ghi chu
	}
	public void timKiemGhiChu(String tenGhiChu, String diaDiemXayRaSuKien) {
		//tim kiem ghi chu theo ten ghi chu va dia diem xay ra su kien
	}
	public void lietKeCacSuKienBoLo(boolean daBoLo) {
		//liet ke cac su kien bo lo
	}
	public void showGhiChu(String maGhiChu) {
		//show ghi chu theo ma ghi chu.
	}
}
