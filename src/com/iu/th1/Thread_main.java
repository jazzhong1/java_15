package com.iu.th1;

public class Thread_main {

	public static void main(String[] args) {

		Thread_1 t1 = new Thread_1();
		Thread_2 t2 = new Thread_2();
		Thread_3 t3 = new Thread_3();
		Thread_4 t4 = new Thread_4();

		Thread t5 = new Thread(t3);
		Thread t6 = new Thread(t4);
		
		t5.start();
		t6.start();

		// t1.start();
		// t2.start();

	}
}
