package com.h.singleton;

class MySingleton{
	private static MySingleton mySingleton=new MySingleton();
	
	private MySingleton() {
		System.out.println("dare to call me");
	}
	
	public static MySingleton getMySingleton() {
		return mySingleton;
	}
}

public class DemoSingleton {
	
	public static void main(String[] args) {
		MySingleton m=MySingleton.getMySingleton();
		
		MySingleton m2=MySingleton.getMySingleton();
		
		MySingleton m3=MySingleton.getMySingleton();
		
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		
		
	}

}
