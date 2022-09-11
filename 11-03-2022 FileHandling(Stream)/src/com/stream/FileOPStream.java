package com.stream;

import java.io.FileOutputStream;

public class FileOPStream {

	
	public static void main(String[] args) {
		String s="null";
		try {
	FileOutputStream fos = new FileOutputStream("/Users/ayeshafatima/Documents/abc");
		//String s="Hello";
	    s="Developing File Output Stream program";
		byte b[]=s.getBytes();
        fos.write(b);
		fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Data inserted");
	}

}
