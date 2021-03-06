package com.c.serili_deser.ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerCompostion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo3.ser")));
		
		Dog dog=(Dog) ois.readObject();
		
		System.out.println(dog.getDogName());
		System.out.println(dog.getCollar().size);
		System.out.println(dog.getCollar().price);
	}
}
