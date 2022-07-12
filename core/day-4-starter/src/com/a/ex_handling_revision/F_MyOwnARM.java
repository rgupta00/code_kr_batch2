package com.a.ex_handling_revision;

class MyResouce implements AutoCloseable{

	public MyResouce() {
		System.out.println("it is ctr");
	}
	
	public void MyLogicMethod() {
		System.out.println("it is the logic");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("close method is called...");
	}
	
}
public class F_MyOwnARM {
	
	public static void main(String[] args) {
		try(MyResouce myResouce=new MyResouce()){
			myResouce.MyLogicMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
