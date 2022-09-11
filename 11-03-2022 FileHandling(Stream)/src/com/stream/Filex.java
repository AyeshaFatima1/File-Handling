package com.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filex {

	public static void main(String[] args)throws IOException {
		FileReader input=null;
		FileWriter output=null;
		try {
			input=new FileReader("/Users/ayeshafatima/Documents/abc");
		    output=new FileWriter("/Users/ayeshafatima/Documents/cba");
			int i;
			while((i=input.read())!=-1) {
				output.write(i);
			}
		}
			finally {
				if(input!=null) {
					input.close();
					if(output!=null) {
						output.close();
					}
				}
			}
	}
}
	
