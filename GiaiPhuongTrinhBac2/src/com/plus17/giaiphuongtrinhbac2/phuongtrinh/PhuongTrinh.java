package com.plus17.giaiphuongtrinhbac2.phuongtrinh;

public class PhuongTrinh {
	private double a, b, c, x1, x2;

	
	public PhuongTrinh(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void giaiPT() {
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("PT vo nghiem");
		} else if (delta == 0) {
			x1 = (-b) / (2 * a);
			System.out.println("PT co 1 nghiem la " + x1);
		} else {
			double canDelta = Math.sqrt(delta);
			x1 = (-b - canDelta) / (2 * a);
			x2 = (-b + canDelta) / (2 * a);
			System.out.println("PT co 2 nghiem. Nghiem thu 1 la " + x1);
			System.out.println("PT co 2 nghiem. Nghiem thu 2 la " + x2);
		}

	}
}
