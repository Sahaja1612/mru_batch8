package com.mru.oops;

public class MultiplicationImpls extends SubtractionImpls implements MultiplicationInterface {

	@Override
	public void multi1() {
			int num1 = 200;
			int num2 = 100;
			int res = num1*num2;
			System.out.println(res);

	}

	@Override
	public void multi2(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(res);

	}

	@Override
	public int multi3() {
		int num1 = 200;
		int num2 = 100;
		int res = num1 * num2;
		return res;
	
	}

	@Override
	public int multi4(int num1, int num2) {
		int res = num1 * num2;
		return res;
	}

}
