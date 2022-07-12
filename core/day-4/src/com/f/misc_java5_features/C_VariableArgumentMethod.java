package com.f.misc_java5_features;

class Cal {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	int add(int... a) {
		int sum = 0;
		for (int temp : a) {
			sum += temp;
		}
		return sum;
	}
}

public class C_VariableArgumentMethod {

	public static void main(String[] args) {

		Cal cal=new Cal();
		int sum=cal.add(2,4,5);
		System.out.println(sum);
	}

}
