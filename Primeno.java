//Write program to find prime no or not
import java.util.*;
class Primeno
{
	public static void main(String args[])
	{
		int n,i,flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for Prime ");
		n=sc.nextInt();
		if(n==1 || n==2)
		{
			flag=1;
		}
		else
		{
			for(i=2;i<=n-1;i++)
			{
				System.out.println("n="+n);
				System.out.println("i="+i);
					if(n%i==0)
					{
						flag=0;
						break;
 					}
			}
		}
		if(flag==1)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}