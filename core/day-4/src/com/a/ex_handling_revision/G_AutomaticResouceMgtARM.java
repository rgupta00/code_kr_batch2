package com.a.ex_handling_revision;

import java.util.Scanner;

public class G_AutomaticResouceMgtARM {

	//java 1.7: Autoclosble interface
	public static void main(String[] args) {
		
		//ARM 
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("pe the no");
			int val=scanner.nextInt();
			System.out.println(val);
//		}catch(Exception e) {
//			
//		}
//		finally {
//			
//		}
		}
	}
}
