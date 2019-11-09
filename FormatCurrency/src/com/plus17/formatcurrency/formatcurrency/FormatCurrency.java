package com.plus17.formatcurrency.formatcurrency;

public class FormatCurrency {
	private long longMoney;

	public FormatCurrency(long longMoney) {
		super();
		this.longMoney = longMoney;
	}

	public String formatCurrency() {
		String kq = "";
//		long soChuSo = demSoChuSo(this.longMoney);

		boolean chiaLanDau=true;
		while (true) {
			long baSoCuoi = longMoney % 1000;
			longMoney /= 1000;
			// Neu khong phai chia lan cuoi(k phai 23,11,10)
			if (longMoney != 0) {
				if (9 < baSoCuoi && baSoCuoi < 100) {
					if (chiaLanDau==true) {
						kq = "0" + baSoCuoi+ kq ;
						chiaLanDau=false;
					} else {
						
						kq = "0" + baSoCuoi + ","+ kq ;
					}
				} else if (baSoCuoi < 10) {
					if (chiaLanDau==true) {
						kq = "00" + baSoCuoi + kq;
						chiaLanDau=false;
					}else {
						
						kq = "00" + baSoCuoi  + ","+ kq;
					}
				} else {
					if (chiaLanDau==true) {
						kq = baSoCuoi+kq;
						chiaLanDau=false;
					}else {
						
						kq = baSoCuoi + ","+kq;
					}
				}
			}
			//neu la chia lan cuoi
			else {
				if (chiaLanDau==true) {
					kq =baSoCuoi+kq;
					chiaLanDau=false;
					break;
				}else {
					
					kq = baSoCuoi + "," + kq;
					break;
				}
			}

//			soChuSo -= 3;
		}
		return kq;
	}

//	private long demSoChuSo(long longMoney) {
//		long soChuSo = 0;
//		while (longMoney != 0) {
//			longMoney /= 10;
//			soChuSo += 1;
//		}
//		return soChuSo;
//	}
}
