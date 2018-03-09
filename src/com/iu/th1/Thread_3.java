package com.iu.th1;

public class Thread_3 implements Runnable { 	//인터페이스는 추상메스드와,상수를 가지고있기때문에 오버라이딩 

	@Override
	public void run() {
		this.sr3();
	}
	
	public void sr3(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);	//0.5초
				System.out.println("TV보기");
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}

}
