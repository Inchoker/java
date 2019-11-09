package com.plus17.tinhsongay.thangvanam;

public class ThangVaNam {

	private int thang, nam;

	public ThangVaNam(int thang, int nam) {
		super();
		this.thang = thang;
		this.nam = nam;
	}

	public void inRaSoNgay() {
		if (nam % 4 == 0) {
			switch (thang) {
			case 1:
				System.out.println("So ngay la" + 31);
				break;
			case 2:
				System.out.println("So ngay la" + 28);
				break;
			case 3:
				System.out.println("So ngay la" + 31);
				break;
			case 4:
				System.out.println("So ngay la" + 30);
				break;
			case 5:
				System.out.println("So ngay la" + 31);
				break;
			case 6:
				System.out.println("So ngay la" + 30);
				break;
			case 7:
				System.out.println("So ngay la" + 31);
				break;
			case 8:
				System.out.println("So ngay la" + 31);
				break;
			case 9:
				System.out.println("So ngay la" + 30);
				break;
			case 10:
				System.out.println("So ngay la" + 31);
				break;
			case 11:
				System.out.println("So ngay la" + 30);
				break;
			case 12:
				System.out.println("So ngay la" + 31);
				break;
			default:
				System.out.println("Thang nhap khong hop le");
				break;
			}
		} else {
			switch (thang) {
			case 1:
				System.out.println("So ngay la" + 31);
				break;
			case 2:
				System.out.println("So ngay la" + 29);
				break;
			case 3:
				System.out.println("So ngay la" + 31);
				break;
			case 4:
				System.out.println("So ngay la" + 30);
				break;
			case 5:
				System.out.println("So ngay la" + 31);
				break;
			case 6:
				System.out.println("So ngay la" + 30);
				break;
			case 7:
				System.out.println("So ngay la" + 31);
				break;
			case 8:
				System.out.println("So ngay la" + 31);
				break;
			case 9:
				System.out.println("So ngay la" + 30);
				break;
			case 10:
				System.out.println("So ngay la" + 31);
				break;
			case 11:
				System.out.println("So ngay la" + 30);
				break;
			case 12:
				System.out.println("So ngay la" + 31);
				break;
			default:
				System.out.println("Thang nhap khong hop le");
				break;
			}
		}
	}
}
