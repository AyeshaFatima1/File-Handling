package com.serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializable {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("/Users/ayeshafatima/Documents/abc");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee em=(Employee)ois.readObject();
			System.out.println(em.id+em.name+em.location);
			ois.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
