// Write a program to find greater number
import java.util.*;
class Greatestno
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			System.out.println("B is Greater");
		}
	}
}