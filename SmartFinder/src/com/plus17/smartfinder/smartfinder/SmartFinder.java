package com.plus17.smartfinder.smartfinder;

public class SmartFinder {
	private int n;
	
	public SmartFinder(int n) {
		super();
		this.n = n;
	}
	//kiem tra tong co nho hon 50 hay k
	private boolean kiemTraTong(int a,int b) {
		int tong =a+b;
		if (tong<50) {
			return true;
		}else {
			return false;
		}
	}
	//kiem tra so uoc chung co lon hon 3 hay khong
	private boolean kiemTraSoUocChung (int a,int b) {
		boolean kq=false;
		int soUoc =0;
		for (int i=1; i<this.n;i++) {
			if(a%i==0 && b%i==0) {
				soUoc+=1;
			}
		}
		if (soUoc >3) {
			kq= true;
		}
		return kq;
	}

	public void findLargeArea() {
		for (int a =1;a<this.n;a++) {
			for (int b=1;b<this.n;b++) {
				if(kiemTraSoUocChung(a, b)==true&&kiemTraTong(a, b)==true) {
					System.out.println("cap so la"+a+","+b);
				}
			}
		}
	}
	private boolean kiemTraSoLuongUocLonHon3(int n) {
		boolean kq =false;
		int soUoc=0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				soUoc+=1;
			}
			if (soUoc>=3) {
				kq=true;
			}
		}return kq;
	}
	public void timSoLonNhat() {
		for (int i =this.n;i>0;i--) {
			if (kiemTraSoLuongUocLonHon3(i)) {
				System.out.println(i);
			}else {
				System.out.println("Nhap so khac");
			}
		}
	}
}



