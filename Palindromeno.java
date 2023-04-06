//Write a program to find Palindrome number
import java.util.*;
class Palindromeno
{
	public static void main(String args[])
	{
		int n,n1,s=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		n1=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;

		}
		if(s==n1)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}