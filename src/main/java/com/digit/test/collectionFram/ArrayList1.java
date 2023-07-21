/**
 * 
 */
package com.digit.test.collectionFram;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

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
		l.add(23);
		l.add(3);
		l.add(1);
		l.add(2);
		l.addAll(a1);
		//System.out.println(l);
		
		a2.addAll(l);
		System.out.println(a2);
		System.out.println(l.getLast());
		System.out.println(l.offer(23));
		System.out.println(l.parallelStream());
		System.out.println(l.remove(2));
		l.remove(3);
		
		
		System.out.println(l);
		
		ArrayDeque ad= new ArrayDeque();
		ad.add(32);
		ad.add(3);
		ad.add(2);
		ad.add(1);
		ad.add(3);
		ad.add(4);
		
		ad.addFirst(65);
		ad.remove(3);
		
		System.out.println(ad);
		PriorityQueue pq= new PriorityQueue();
		pq.add(25);
		pq.add(19);
		pq.add(75);
		pq.add(150);
		pq.add(85);
		pq.add(30);
		pq.add(10);
		System.out.println(pq);
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(80);
		pq1.add(20);
		pq1.add(60);
		pq1.add(2);
		pq1.add(50);
		pq1.add(90);
		pq1.add(150);
		pq1.add(125);
		System.out.println(pq1);
		
		TreeSet ts= new TreeSet();
		ts.add(80);
		ts.add(20);
		ts.add(60);
		ts.add(2);
		ts.add(50);
		ts.add(90);
		ts.add(150);
		ts.add(125);
		
		System.out.println(ts.ceiling(150));
		System.out.println(ts);
		
		
	}

}
