package com.a.io_examples.ex_basicsio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_Char_Vs_Byte {

	public static void main(String[] args) {
		//FileReader FileWriter: char
		//FileInputStream vs FileOutputStream
		
		//BufferedOutputStream<----FileOutputStream <--File
		//BufferedInputStream <----FileInputStream<---File
		try {
			FileInputStream fr=new FileInputStream(new File("C:\\photos\\gj.jfif"));
			FileOutputStream fw= new FileOutputStream(new File("C:\\photos\\gj3.jfif"));
			
			long start= System.nanoTime();
			
			int i=0;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			
			long end= System.nanoTime();
			
			System.out.println("time taken: "+ (end-start)+" ns");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
