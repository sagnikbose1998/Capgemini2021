package com.capgemini.concurrency.executorexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorFramework {
	
	private static ExecutorService executor=null;
	private static volatile Future taskOneOutput=null;
	private static volatile Future taskTwoOutput=null;
	
	public static void main(String[] args) {
		
		executor=Executors.newFixedThreadPool(2);
		while(true) {
			try {
				checkTasks();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Caught Exception ="+e.getMessage());
			}
		}

	}

	private static void checkTasks() throws Exception{
		
		
	}

}