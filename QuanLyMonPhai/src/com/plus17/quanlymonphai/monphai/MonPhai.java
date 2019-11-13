package com.plus17.quanlymonphai.monphai;

import com.plus17.quanlymonphai.kynang.KyNang;

public class MonPhai {
	private String tenPhai, tenTruongMon, noiO, monQuy, moTa;
	private KyNang dSKyNang[];

	public MonPhai(String tenPhai, String tenTruongMon, String noiO, String monQuy, String moTa, KyNang[] dSKyNang) {
		super();
		this.tenPhai = tenPhai;
		this.tenTruongMon = tenTruongMon;
		this.noiO = noiO;
		this.monQuy = monQuy;
		this.moTa = moTa;
		this.dSKyNang = dSKyNang;
	}

	protected void inTT() {
		// in thong tin mon phai
	}

	protected void soTaiMonPhai(MonPhai monPhaiCanSoTai) {
		// in ra mon phai thang
	}

	protected void luyenCong(String vuKhi, String kyNangLuyen) {
		//phuong thuc luyen cong.
	}

	protected void anUong(String doAn, thoiGian, diaDiem) {
		//phuong thuc an uong.
	}
	
}
