package com.c.serili_deser.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B_HelloWorld_De_Serilization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		//de-ser
		ObjectInputStream oos=new ObjectInputStream(new FileInputStream(new File("data.ser")));
		
		Account account=(Account) oos.readObject();
		
		System.out.println(account);
		
	}
}
