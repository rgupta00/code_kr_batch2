package com.a.excpetion_examples.user_defind;

import com.common.Emp;

public class StackMain {
	
	public static void main(String[] args) {
		Stack s=new Stack();
		Emp emp1=new Emp(1, "raj");
		Emp emp2=new Emp(16, "ekta");
		
		try {
			s.push(emp1);
			s.push(emp2);
			s.pop().print();
			s.pop().print();
			s.pop().print();
			
		} catch (StackFullException e) {
			System.out.println(e.getMessage());
		}catch(StackEmptyException e) {
			System.out.println(e.getMessage());
		}
		
		
	
		
	}

}
