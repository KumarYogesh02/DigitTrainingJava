/**
 * 
 */
package com.digit.test.collectionFram;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 */
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList <Integer> a1= new ArrayList();
		a1.add(100);
		a1.add(7);
		a1.add(100);
		System.out.println(a1);
		
		ArrayList a2= new ArrayList();
		a2.add(0,"yash" );
		a2.add(1, "vipul");
		a2.add(2,"kartik");
		System.out.println(a2);
		a2.addAll(a2);
		a2.clear();
		System.out.println(a2);
		ArrayList a4=(ArrayList) a1.clone();
		System.out.println(a4);
		System.out.println(a1.contains(100));
		System.out.println(a1.equals(a4));
		System.out.println(a1.get(1));
		System.out.println(a1.hashCode());
		System.out.println(a1.indexOf(100));
		System.out.println(a1.isEmpty());
		System.out.println(a1.lastIndexOf(8));
	//	System.out.println(a1.remove(0));
	//	System.out.println(a1);
		//System.out.println(a1.removeAll(a4));
		//System.out.println(a1);
		//System.out.println(a1.retainAll(a2));
		//System.out.println(a1.removeIf(n->n%2==0));
	
		System.out.println(a1.getClass());
		System.out.println(a1.set(0, 55));
		System.out.println(a1.stream());
		//System.out.println(a1.forEach(null));
	
		
		System.out.println(a1);
		LinkedList l= new LinkedList();
		l.add("yash");
		l.add("jadu");
		l.addAll(a1);
		//System.out.println(l);
		
		a2.addAll(l);
		System.out.println(a2);
		System.out.println(l.getLast());
		System.out.println(l.offer(23));
		System.out.println(l.parallelStream());
		System.out.println(a1);
		System.out.println(l);
		
	}

}
