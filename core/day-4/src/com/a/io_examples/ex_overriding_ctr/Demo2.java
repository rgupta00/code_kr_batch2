package com.a.io_examples.ex_overriding_ctr;

import java.io.IOException;

class X {

	//-----no such rule for method overloading
	//rule : overriding and ctr
	
	void a(int a)throws IOException {

	}

	void a(int a, int b) {

	}

	X() throws Exception {
		System.out.println("CTR class X");
	}
}

// drived class ctr can not throw smaller ex then base method ctr

class Y extends X {
	Y() throws Exception {
		super();
		System.out.println("ctr of class Y");
	}
}

public class Demo2 {

	public static void main(String[] args) {

		// X x = new Y();

		System.out.println("---------");
	}

}
