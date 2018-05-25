package com.mediaflow.tips;

import com.mediaflow.tips.common.Constants;

public class TestMath {

	public static void main(String[] args) {
		int a = 18;
		int b = 10;
		System.out.println("good: "+ a/b);
		double logtemp = (double) 18 / 10;
		System.out.println(String.format("%.2f", logtemp));
		System.out.println(logtemp);
		
		long temp = Math.round(1.8);
		System.out.println(temp);
	}
}
