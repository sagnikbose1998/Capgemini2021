package com.capgemini.sagnik.lab8;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sm_source=new File("D:\\CapgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\shrijit\\lab8\\source.txt"); // initializing Shrijit Majumder's source file
		File sm_target=new File("D:\\CapgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\shrijit\\lab8\\target.txt"); // initializing Shrijit Majumder's target file
		CopyDataThread cdt = new CopyDataThread(sm_source,sm_target);
		cdt.start();
	}

}
