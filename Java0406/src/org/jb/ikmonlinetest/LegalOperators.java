package org.jb.ikmonlinetest;

public class LegalOperators {

	public static void main(String[] args) {
		int x =5;
		x += 3;
		System.out.println("x after 1st Op--> " +x);
		x = ~x;
		System.out.println("x after 2nd Op--> " +x);
//		x.value(); we can't invoke value() on primitive type
//		x = !x; ! is undefined 
		x = x >> 1;
		System.out.println("x after 3rd Op--> " +x);
	}

}