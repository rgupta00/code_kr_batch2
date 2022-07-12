package com.d.enum_ex;
//java 1.4 

interface Months {
	public static final int JAN = 0;
	public static final int FAB = 1;
	public static final int MARCH = 2;
}

interface Gender {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
}

public class B_Problem_With_Interface {

	public static void main(String[] args) {

		if (Months.JAN == Gender.MALE) {
			System.out.println("are same");
		}else
			System.out.println("not same");
	}

}
