package com.iu.th1;

public class Thread_4 implements Runnable{

	@Override
	public void run() {
		this.sr4();
		
	}

	public void sr4(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);	//0.5초
				System.out.println("카톡하기");
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}


}
