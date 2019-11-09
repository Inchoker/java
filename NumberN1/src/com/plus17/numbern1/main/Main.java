package com.plus17.numbern1.main;

import com.plus17.numbern1.NumberN1.NumberN1;

public class Main {

	public static void main(String[] args) {
		NumberN1 nB = new NumberN1();
		int temp=nB.takeNFromUser();
		nB.setNumberN1(temp);
		System.out.println(nB.calcSumChar());
		nB.findPerfectNumber();
		System.out.println(nB.findGCDivisor());
		System.out.println(nB.findGCDivisor2());

	}

}
