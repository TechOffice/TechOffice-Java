package com.techoffice.list;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Vectors are synchronized. Therefore, it is thread safe. ArrayList is unsynchronized, therefore, not thread safe. 
 * When two threads are modifying an ArrayList, some data may not be updated.
 * 
 * In this example, it would show you when threads is updating an ArrayList and a Vector, the number of data of them would be different but the expected is the same. 
 *  
 * @author Ben_c
 *
 */
public class VectorExample implements Runnable{
	
	public ArrayList<String> list;
	public Vector<String> vector;
	public static final int ITEM_SIZE = 200;
	
	public VectorExample(ArrayList<String> list, Vector<String> vector){
		this.list = list;
		this.vector = vector;
	}
	
	public void run() {
		long threadId = Thread.currentThread().getId();
		for (int i=0; i<ITEM_SIZE ; i++){
			this.list.add("Thread" + threadId + "Item" + i);
			this.vector.add("Thread" + threadId + "Item" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		ArrayList<String> aList = new ArrayList<String>();
		Vector<String> aVector = new Vector<String>();
		VectorExample example1 = new VectorExample(aList, aVector);
		VectorExample example2 = new VectorExample(aList, aVector);
		Thread t1 = new Thread(example1);
		Thread t2 = new Thread(example2);
		t1.start();
		t2.start();
	    t1.join();
	    t2.join();
	    System.out.println("Size of ArrayList: " + aList.size());
	    System.out.println("Size of Vector: " + aVector.size());
	    System.out.println("Expected Size of ArrayList and Vector:�@" + VectorExample.ITEM_SIZE * 2);
	}
}
