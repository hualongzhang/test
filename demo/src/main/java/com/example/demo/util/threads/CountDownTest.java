package com.example.demo.util.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownTest {

	static class Driver{
		public void test() throws InterruptedException{
			int N=1;
			//CountDownLatch startSignal = new CountDownLatch(1);
			CountDownLatch doneSignal = new CountDownLatch(N);
			for(int i=0;i<N;i++)
				 new Thread(new Worker(null, doneSignal)).start();
			doSomethingElse(); 
			//startSignal.countDown(); //解除worker线程的阻塞状态 达到worker线程同时执行的目的
			doSomethingElse();
			doneSignal.await();
			System.out.println("子线程结束后才执行");
		}
		void doSomethingElse(){
			System.out.println(Thread.currentThread().getName()+"doSomethingElse"+"执行");
		}
	}
	
	static class Worker implements Runnable{

		private final CountDownLatch startSignal;
		private final CountDownLatch doneSignal;
		Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
		     this.startSignal = startSignal;
		     this.doneSignal = doneSignal;
		}
		 
		@Override
		public void run() {
			try{
				//startSignal.await();
				doWork();
				doneSignal.countDown();
			}catch(Exception ex){
				
			}
		}
		
		void doWork(){
			System.out.println(Thread.currentThread().getName()+"====="+"执行时间"+System.currentTimeMillis());
		}
	}
	

	
	public static void main(String[] args) throws Exception{
		CountDownTest.Driver a=new CountDownTest.Driver();
		a.test();
	}
}
