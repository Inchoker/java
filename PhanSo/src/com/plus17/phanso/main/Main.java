package com.plus17.phanso.main;

import com.plus17.phanso.phanso.PhanSo;

public class Main {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo(14, 24);
		PhanSo ps2 = new PhanSo(12, 2);
		String kq = ps1.congPhanSo(ps2);
		String kq2 = ps1.truPhanSo(ps2);
		String kq3 = ps1.nhanPhanSo(ps2);
		String kq4 = ps1.chiaPhanSo(ps2);
		
		System.out.println(kq);
		System.out.println(kq2);
		System.out.println(kq3);
		System.out.println(kq4);

	}

}
