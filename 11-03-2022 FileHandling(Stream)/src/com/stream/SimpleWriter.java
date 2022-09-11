package com.stream;

import java.io.*;

public class SimpleWriter {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("/Users/ayeshafatima/Documents/abc");
			fw.write("Developing File IO program");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Data inserted");
	}

}
