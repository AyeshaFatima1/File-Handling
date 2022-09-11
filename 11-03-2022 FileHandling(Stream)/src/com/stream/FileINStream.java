package com.stream;

import java.io.FileInputStream;

public class FileINStream {

	public static void main(String[] args) {
		try {
			int i;
	FileInputStream fis = new FileInputStream("/Users/ayeshafatima/Documents/abc");
	while ((i=fis.read())!=-1) {
		//System.out.println((char)i);	
				System.out.print((char)i);	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("\n"+"Data inserted");
	}

}
