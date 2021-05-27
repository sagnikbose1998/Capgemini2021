import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number::");
		int num=sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			System.out.println(num+" is a Perfect Number");
		else
			System.out.println(num+" is not a Perfect Number");
	}

}