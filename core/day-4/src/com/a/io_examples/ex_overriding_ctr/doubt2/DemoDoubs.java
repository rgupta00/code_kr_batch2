package com.a.io_examples.ex_overriding_ctr.doubt2;
//static method dont support overriding !! they support "shadowing" concept
class A {
	 int i=33;
	public  void foo() {
		System.out.println("foo of class A"+i);
	}
}

class B extends A {
	// int i=55;
	public  void foo() {
		System.out.println("foo of class B" +i);
	}
}

public class DemoDoubs {
	public static void main(String[] args) {

		A a=new B();
		a.foo();
	}
}
