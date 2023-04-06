//Write program to print first 10 numbers
import java.util.*;
class Firsttenno
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}