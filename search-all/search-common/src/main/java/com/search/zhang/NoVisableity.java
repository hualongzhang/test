package com.search.zhang;

import java.util.concurrent.CompletionService;

public class NoVisableity {

	private static Boolean flag;
	private static int num;
	
	private static class ReaderThread extends Thread{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(!flag) {
				System.out.println(num+"==="+flag);
				Thread.interrupted();
			}
			System.out.println(num);
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		
		
		
	}
	
}
