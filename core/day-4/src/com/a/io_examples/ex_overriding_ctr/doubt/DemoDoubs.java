package com.a.io_examples.ex_overriding_ctr.doubt;
class AEx extends Exception{
}

class BEx extends AEx{
}

class A{
	public static void foo() throws BEx{
		System.out.println("foo of class A");
	}
}

class B extends A{
	public static void foo() throws AEx{
		System.out.println("foo of class A");
	}
}



public class DemoDoubs {
	
	public static void main(String[] args) {
		
	}

}
