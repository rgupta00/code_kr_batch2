package com.a.ex_handling_revision;

class MyResource implements AutoCloseable {

	public MyResource() {
		System.out.println("ctr of MyResource");
	}

	public void doWork() {
		System.out.println("dowork method of MyResource");
	}

	@Override
	public void close() throws Exception {
		// any cleanup code
		System.out.println("close method is called");
	}

}

public class G_AutomaticResouceMgtARMByProg {

	public static void main(String[] args) {
		try (MyResource m = new MyResource()) {
			m.doWork();
		} catch (Exception e) {
		}
	}
}
