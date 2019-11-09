package com.plus17.phanso.phanso;

public class PhanSo {
	private int tuSo, mauSo;

	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public String congPhanSo(PhanSo pSo2) {
		int tuSoKetQua = this.tuSo * pSo2.mauSo + this.mauSo * pSo2.tuSo;
		int mauSoKetQua = this.mauSo * pSo2.mauSo;
//		for (int i=2;i<mauSoKetQua;i++) {
//			while(tuSoKetQua%i==0&&mauSoKetQua%i==0) {
//				tuSoKetQua/=i;
//				mauSoKetQua/=i;
//			}
//			
//		}
//		return tuSoKetQua +"/"+mauSoKetQua;
//		
//	}
		return lamTron(tuSoKetQua, mauSoKetQua);
	}

	private String lamTron(int tuSoKetQua, int mauSoKetQua) {
		int n = 2;
		int mauSoSoSanh =mauSoKetQua;
		while (n < mauSoSoSanh) {
			if (mauSoKetQua % n == 0 && tuSoKetQua % n == 0) {
				tuSoKetQua /= n;
				mauSoKetQua /= n;
			} else
				n += 1;
		}
		if (mauSoKetQua == 1) {
			return tuSoKetQua + "";
		}

		return tuSoKetQua + "/" + mauSoKetQua;
	}

	public String truPhanSo(PhanSo pSo2) {
		int tuSoKetQua = this.tuSo * pSo2.mauSo - this.mauSo * pSo2.tuSo;
		int mauSoKetQua = this.mauSo * pSo2.mauSo;
		return lamTron(tuSoKetQua, mauSoKetQua);

	}
	public String nhanPhanSo(PhanSo pSo2) {
		int tuSoKetQua = this.tuSo * pSo2.tuSo;
		int mauSoKetQua = this.mauSo * pSo2.mauSo;
		return lamTron(tuSoKetQua, mauSoKetQua);
	}
	public String chiaPhanSo(PhanSo pSo2) {
		int tuSoKetQua = this.tuSo * pSo2.mauSo;
		int mauSoKetQua = this.mauSo * pSo2.tuSo;
		return lamTron(tuSoKetQua, mauSoKetQua);
	}

}
