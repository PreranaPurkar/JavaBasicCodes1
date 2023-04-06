//Write a program to addition of two numbers
import java.util.*;
class Addition
{
	public static void main(String args[])
	{
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of two no="+c);
	}
}
