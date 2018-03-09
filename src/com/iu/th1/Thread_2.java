package com.iu.th1;

public class Thread_2 extends Thread {

	@Override
	public void run() {
		this.s2();
	}

	public void s2() {
		for (int i = 'A'; i < 'j'; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}

			System.out.println((char) i);
		}
	}
}
