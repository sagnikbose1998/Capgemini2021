import java.util.Scanner;

public class DisariumNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER::");
		int n=sc.nextInt();
		int num=n,sum=0,count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		int temp=n;
		while(n>0)
		{
			int d=n %10;
			int p= (int)(Math.pow(d, count));
			count--;
			sum+=p;
			n/=10;
		}
		if(sum==temp)
			System.out.println(temp+" is a Disarium Number");
		else
			System.out.println(temp+" is not a Disarium Number");
	}
}
