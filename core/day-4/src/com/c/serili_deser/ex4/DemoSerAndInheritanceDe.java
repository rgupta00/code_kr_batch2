package com.c.serili_deser.ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DemoSerAndInheritanceDe {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("data.ser")));
		Bar bar=(Bar) ois.readObject();
		System.out.println(bar.i);
		System.out.println(bar.j);
		System.out.println("------done---");
	}
}
