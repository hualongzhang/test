package com.example.demo.util.threads;

import com.example.demo.service.ServiceTest;

/**
 * @author zhanghualong
 * 设置线程终止
 */
public class ThreadInterruptedTest {
	
	static class Thread1 extends Thread{

		boolean interruptedFlag=false;
		
		int i=0;
		
		@Override
		public void run() {
			while(true){
				if(!Thread.interrupted()) {
					if(interruptedFlag) {
						System.out.println("============"+i+Thread.currentThread().getName());
						Thread.currentThread().interrupt();
					}else{
						i++;
						System.out.println("============"+i);
					}
				}else {
					System.out.println("============break"+i);
					return;
				}
					
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		ThreadInterruptedTest.Thread1 thread1=new ThreadInterruptedTest.Thread1();
		thread1.start();
		Thread.sleep(1000*3);
		System.err.println("设置线程终止");
		thread1.interruptedFlag=true;

	}

}
