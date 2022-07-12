package com.a.ex_handling_revision;

public class DemoSplit {
 public static void main(String[] args) {
	String data="This is a beautiful story of a thirsty crow that teaches a lesson. The moral of this story";
	String tokens[]=data.split(" ");
	
	for(String token: tokens) {
		System.out.println(token);
	}
}
}
