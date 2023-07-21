package com.digit.test.collectionFram;

import java.util.HashSet;

public class HashSet2 {
	
	public static void main(String[] args)  {
		HashSet hs= new HashSet();//ctrl+shift +o
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(75);
		hs.add(1);
		hs.add(25);
		hs.add(125);
		hs.add(175);
		hs.add(454);
		hs.remove(1);
		Object hs1=hs.clone();	
		System.out.println(hs.hashCode());
//		
//		hs1.wait(3000);

		System.out.println(hs);
		System.out.println(hs1);
		
		
	}

}
