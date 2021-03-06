package com.a.io_examples.ex_overriding_ctr;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 				Exception
 * 				IOException
 * 			FileNotFoundException
 * 
 */
class A {
	void foo() throws IOException {
		System.out.println("foo method of class A");
	}
}

class B extends A {
	// drived method can not throw bigger ex then base method
	// throwing smaller is ok
	// throwing no ex is also ok
	// throwing extra unchecked ex is also ok
	@Override
	void foo() throws ArithmeticException {
		System.out.println("foo method of class B overriden");
	}
}

public class Demo {

	public static void main(String[] args) {

		try {
			A a = new B();
			a.foo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
