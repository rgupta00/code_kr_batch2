package com.c.serili_deser.ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Collar {
	int size;
	int price;
}

class Dog implements Serializable {

	// transient
	transient Collar collar;
	String dogName;

	// i can interfare during ser and de-ser

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeInt(collar.size);
		oos.writeInt(collar.price);
		
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		collar=new Collar();
		collar.size=ois.readInt();
		collar.price=ois.readInt();
		
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

}

public class SerilizationAndComposition {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("foo3.ser"));

		Collar collar = new Collar();
		collar.size = 10;
		collar.price= 200;
		
		Dog dog = new Dog();
		dog.setCollar(collar);

		dog.setDogName("stonish");

		oos.writeObject(dog);
		System.out.println("------------");
	}
}
