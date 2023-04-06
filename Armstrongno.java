//Write a program to find Armstrong number
import java.util.*;
class Armstrongno
{
	public static void main(String args[])
	{
		int n,sum=0,r,n1,cube;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		n1=n;
		while(n>0)
		{
			r=n%10;
			cube=r*r*r;
			sum=sum+cube;
			n=n/10;
		}
		if(sum==n1)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}
			