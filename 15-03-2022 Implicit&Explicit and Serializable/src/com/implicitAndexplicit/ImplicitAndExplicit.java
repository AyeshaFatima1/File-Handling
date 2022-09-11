package com.implicitAndexplicit;

public class ImplicitAndExplicit {

	public static void main(String[] args) {
		//java explicit or narrowing done
		System.out.println("Explicit or Narrowing");
		double d=40.6;
		float a=(float)d;
		long b=(long)a;
		int c=(int)b;
		
		System.out.println("double value:"+d);
		System.out.println("float value:"+a);
		System.out.println("long value:"+b);
		System.out.println("int value:"+c);
		
		//java implicit or widening done
		System.out.println("Implicit or Widening");
		byte i=60;
		short j=i;
		int k=j;
		long l=k;
		double m=l;
		
		System.out.println("byte value:"+i);
		System.out.println("short value:"+j);
		System.out.println("int value:"+k);
		System.out.println("long value:"+l);
		System.out.println("double value:"+m);
	}

}
