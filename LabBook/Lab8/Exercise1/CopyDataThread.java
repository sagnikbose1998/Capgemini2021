/* Exercise 1: Write a program to do the following operations using Thread:
•	Create an user defined Thread class called as “CopyDataThread .java” .
•	This class will be designed to copy the content from one file “source.txt ” to another file “target.txt” and after every 10 characters copied,   “10 characters are copied” message  will be shown to user.(Keep delay of 5 seconds after every 10 characters  read.)
•	Create another class “FileProgram.java” which will create above thread. Pass required File Stream classes to   CopyDataThread constructor and implement the above functionality */

package com.capgemini.sagnik.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread{
	
	File source;
	File target;
	
	public CopyDataThread(File source,File target) {
		this.source=source;
		this.target=target;
	}
	
	public void run() {
		FileInputStream input = null;
		try {
			input = new FileInputStream(source);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(target);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int counter=0;
		int characters=0;
		try {
			while((characters=input.read())>0) {
				output.write((char)characters);
				counter++;
				if(counter%10==0) {
				try {
					System.out.println("10 characters are copied");
					Thread.sleep(5000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
