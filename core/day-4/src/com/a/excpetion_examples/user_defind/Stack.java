package com.a.excpetion_examples.user_defind;

import com.common.Emp;

//-------checked ex
//class StackFullException extends Exception{
//	
//}

class StackFullException extends Exception {
	public StackFullException(String message) {
		super(message);// ?
	}
}
//------------ un checked ex
class StackEmptyException extends RuntimeException {
	public StackEmptyException(String message) {
		super(message);// ?
	}
}

public class Stack {

	private Emp arr[];
	private int SIZE;
	private int top;

	public Stack() {
		SIZE = 5;
		arr = new Emp[5];
		top = -1;
	}

	public void push(Emp emp) throws StackFullException {
		if (top == SIZE - 1)
			throw new StackFullException("stack is full");
		else
			arr[++top] = emp;
	}

	public Emp pop()  {
		if (top == -1) {
			throw new StackEmptyException("stack is empty");
		}
		Emp emp = arr[top];
		arr[top] = null;
		top--;
		return emp;
	}
}
