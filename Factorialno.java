//Write a program to find factorial of given number
import java.util.*;
class Factorialno
{
	public static void main(String args[])
	{
		int n,fact=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number="+fact);
	}
}
		