package com.c.serili_deser.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//serilzation will not fail but during de-ser : instance control flow is called
class Foo {

	int i = 33;

	Foo(int a) {
		System.out.println("ctr of foo");
	}
}

class Bar extends Foo implements Serializable {
	int j = 330;

	Bar() {
		super(44);
		System.out.println("ctr of bar");
	}
}

public class DemoSerAndInheritance {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Bar bar = new Bar();
		bar.i = 888;
		bar.j = 8888;
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("data.ser")));
		oos.writeObject(bar);
		System.out.println("------done---");
	}
}
