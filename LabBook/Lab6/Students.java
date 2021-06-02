/* Exercise 4:  school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90  */

package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
	
	// method to return medal type secured by student as per the marks
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm){
		HashMap<Integer,String> output = new HashMap<>();
		for(Map.Entry<Integer,Integer> m : hm.entrySet()) {
			if(m.getValue()>=90)
			{
				output.put(m.getKey(),"Gold");
			}
			else if(m.getValue()>=80 && m.getValue()<90)
			{
				output.put(m.getKey(),"Silver");
			}
			else if(m.getValue()>=70 && m.getValue()<80)
			{
				output.put(m.getKey(),"Bronze");
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter the strength of the class : ");
		int size=sm.nextInt();
		if(size<1)
			System.out.println("Cannot Proceed...Strength of class should be 1 or more.");
		else {
			HashMap<Integer,Integer> hm=new HashMap<>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter the registration no. of Student "+(i+1)+" : ");
				int regNo=sm.nextInt();
				System.out.print("Enter the marks of Student "+(i+1)+" : ");
				int marks=sm.nextInt();
				hm.put(regNo,marks);
			}
			HashMap<Integer,String> output=getStudents(hm);
			System.out.print("The registration number of the students along with the corresponding medal types are given below :\n");
			for(HashMap.Entry<Integer,String> hp : output.entrySet()) {
				System.out.println("Registration Number : "+hp.getKey()+", Medal Type : "+hp.getValue());
			}
		}
		sm.close();
	}

}
