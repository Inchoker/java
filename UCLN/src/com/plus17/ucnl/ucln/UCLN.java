package com.plus17.ucnl.ucln;

public class UCLN {
	private int a, b;

	public UCLN(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	private int timSoBeHon() {
		if (a <= b) {
			return a;
		} else {
			return b;
		}

	}

	private int timSoLonHon() {
		if (a <= b) {
			return b;
		} else {
			return a;
		}
	}

	public void timUocLonNhat() {
		int soBe = timSoBeHon();
		int soLon = timSoLonHon();
		int kq=1;
		System.out.println(soBe);
		System.out.println(soLon);
		for (int i = soBe; i > 0; i--) {
			if (soBe % i == 0 && soLon % i == 0) {
				kq = i;
				break;
			}

		}
		System.out.println(kq); 
	}
}
