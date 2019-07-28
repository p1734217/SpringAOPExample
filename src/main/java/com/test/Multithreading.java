package com.test;

public class Multithreading {
 
	public static void main(String args[]) {
		System.out.println("Pradeep");
		new Test();
		new Test();
		System.out.println("Pradeep2345");
		
	}
}
class Test implements Runnable {
	private static int count=0;
	private int id;
	
	public void run() {
		for(int i=10;i>0;i--) {
//			try {
//				//Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("<"+id+">"+" Hello  "+i);
		}
	}
	
	public Test() {
		this.id = count++;
		new Thread(this).start();
	}
}
