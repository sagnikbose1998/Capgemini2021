package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VotersList {
	
	// method to return ids of people who are elgible for voting
	public static List<Integer> votersList(Map<Integer,Integer> person){
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : person.entrySet()) {
			if(m.getValue()>=18) {
				list.add(m.getKey());
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter the number of people : ");
		int size=sm.nextInt();
		if(size<1)
			System.out.println("Cannot Proceed...Size should be 1 or more.");
		else {
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<size;i++) {
				System.out.print("Enter id of Person "+(i+1)+" : ");
				int id=sm.nextInt();
				System.out.print("Enter age of Person "+(i+1)+" : ");
				int age=sm.nextInt();
				map.put(id, age);
			}
			List<Integer> list = votersList(map);
			System.out.println("The id of the people who are eligible for voting are given below : ");
			int k=0;
			for(int i : list) {
				System.out.println(list.get(k++));
			}
		}
		sm.close();

	}

}
