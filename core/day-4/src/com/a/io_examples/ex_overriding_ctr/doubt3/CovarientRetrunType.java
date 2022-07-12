package com.a.io_examples.ex_overriding_ctr.doubt3;

//return type of the method can be co-variently related...
class Milk {
}

class Pasteurized extends Milk {
}

class KD {

	public Milk sellMilk() {
		return new Milk();
	}
}

class NewKD extends KD {

	public Pasteurized sellMilk() {
		return new Pasteurized();
	}
}

//class Fuit{
//}
//
//class Apple extends Fuit{
//}
//
//class PApple extends Apple{
//}
//
//class A {
//	public Fuit foo() {
//		System.out.println("foo of class A");
//		return new Fuit();
//	}
//}

//class B extends A {
//	@Override
//	public  PApple foo() {
//		System.out.println("foo of class B");
//		return new PApple();
//	}
//}

public class CovarientRetrunType {

	public static void main(String[] args) {

	}

}
