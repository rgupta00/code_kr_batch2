package com.c.serili_deser.ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class B_SerilizationDeSerOrderMustBeMaintained2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		//
		ObjectInputStream oos=new ObjectInputStream(new FileInputStream("foo2.ser"));
		//now we want to read back the object that we have saved in previous stage... rat , cat and dog		
		
		Rat rat=(Rat) oos.readObject();
		Dog dog =(Dog) oos.readObject();// CCEx
		Cat cat=(Cat) oos.readObject();
		System.out.println("no prob");
		
	}
}
