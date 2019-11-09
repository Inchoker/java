package com.plus17.tinhtuoi.TinhTuoi;

import java.util.Scanner;

public class TinhTuoi {
	private int namSinh;
	public void nhapNam() {
		Scanner newScan = new Scanner(System.in);
		System.out.println("Hay nhap nam sinh vao");
		this.namSinh = newScan.nextInt();
		newScan.close();
	}
	public void tinhTuoi() {
		int kq = 2019 -namSinh;
		System.out.println("tuoi cua ban la "+kq );
		
	}
	
}
