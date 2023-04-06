//Write a program for student information get five subject marks,calculate the total and percentage

import java.util.*;
class Studentinfor
{
	public static void main(String args[])
	{
		int Math,Eng,Phy,Chem,Bio,total;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Five Subject Marks");
		Math=sc.nextInt();
		Eng=sc.nextInt();
		Phy=sc.nextInt();
		Chem=sc.nextInt();
		Bio=sc.nextInt();
		total=Math+Eng+Phy+Chem+Bio;
		System.out.println("Total="+total);
		per=total/5;
		System.out.println("Percentage="+per);
		if(per>=35 && per<=55)
		{
			System.out.println("Student is Pass with D Grade");
		}
		else if(per>=55 && per<=65)
		{
			System.out.println("Student is Pass with C Grade"); 
		}
		else if(per>=65 && per<=75)
		{
			System.out.println("Student is Pass with B Grade");
		}
		else if(per>=75 && per<=85)
		{
			System.out.println("Student is Pass wiht A Grade");
		}
		else if(per>=85 && per<=100)
		{
			System.out.println("Student is Pass with A+ Grade");
		}
		else
		{
			System.out.println("Student is Fail");

		}
	}
}