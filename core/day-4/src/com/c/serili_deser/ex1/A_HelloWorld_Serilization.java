package com.c.serili_deser.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class A_HelloWorld_Serilization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Account account=new Account(1, "raj", 80000);
		
		account.setBalance(100000);
		account.bankName="pnb";
		
		//What is serilization? byte data prcessing
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("data.ser")));
		oos.writeObject(account);
		System.out.println("------------------------");
		//We have a account object how to serilized it?
	
		
		
		
		
		
		
		
		/*1. seriliztion is not for staitc data
		 * 2. we have to maintain the order of de-serilization ...
		 * 3. object graph serilization
		 * 4. serilization and compostion
		 * 5. writeObject() and readObject() method ...jugaad
		 * 6. serilization and inheritance.. instance control flow
		 * 7. serilization and sigleton design pattern
		 * 
		 */
		
		
		
	}
}












