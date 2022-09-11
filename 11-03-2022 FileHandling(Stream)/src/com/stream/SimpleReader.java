package com.stream;

import java.io.*;

public class SimpleReader {

	public static void main(String[] args) {
		try {
			int i;
			FileReader fr = new FileReader("/Users/ayeshafatima/Documents/abc");
			while ((i=fr.read())!=-1) {
		//System.out.println((char)i);	
				System.out.print((char)i);	
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" Data inserted");
	}

}
