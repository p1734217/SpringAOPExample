package com.test;

public class LoopTaskA implements Runnable{

	private static int count=0;
	private int id;
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("##### <TASK- "+id+" > Starting #####");
		for(int i=10; i>0;i--) {
			System.out.println("<TASK- "+id+">TICK TICK "+i);
			try {
				Thread.sleep((long)Math.random()*1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("****<TASK "+id+" >Done *****");
	}
	public LoopTaskA() {
		this.id =++count;
	}
    
}
