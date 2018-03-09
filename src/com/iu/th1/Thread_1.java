package com.iu.th1;

public class Thread_1 extends Thread{
	
	@Override
	public void run() {
		this.s1();		//여기안에 반복적으로 할 코드
	}

	
	public void s1(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(999);	//1초 쉬라는의미
									//suspend(),sleep(),wait(),join(),i/o bolck
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			System.out.println("s1:"+i);
		}
	}
}
