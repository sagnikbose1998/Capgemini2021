import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		int num=sc.nextInt();
		int sum=0,d,temp=num,fact;
		while(num>0)
		{
			 d=num%10;
			 fact=1;
			 for(int i=1;i<=d;i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 num=num/10;
			}
		if(sum==temp)
			System.out.println(temp+" IS A STRONG NUMBER");
		else
			System.out.println(temp+" IS NOT A STRONG NUMBER");

	}

}