//Write a program to Hotel Menu Card
import java.util.*;
class Hotelmenu
{
	public static void main(String args[])
	{
		int qty,order,bill=0;
		double discount=0.0,netbill=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("********** Hotel Anvika Menu Card *************");
		System.out.println("\n1.Pizza \n2.Burger \n3.Coffee \n4.Pestries \n5.Exit");
		System.out.println("Enter the Order No:");
		order=sc.nextInt();
		System.out.println("Enter the Quantity:");		
		qty=sc.nextInt();
		if(order>=1 && order<=4)
		{
			System.out.println("Quantity of Menu Item="+qty);
		}
		switch(order)
		{
			case 1:
				System.out.println("Your order is Pizza with Price 250 Rs.");
				bill=qty*250;
				System.out.println("Your bill ="+bill);
			break;
			case 2:
				System.out.println("Your order is Burger with Price 150 Rs.");
				bill=qty*150;
				System.out.println("Your bill="+bill);
			break;
			case 3:
				System.out.println("Your order is Cofee With Price 50 Rs.");
				bill=qty*50;
				System.out.println("your bill="+bill);
			break;
			case 4:
				System.out.println("Your order is Pestries with Price 45 Rs.");
				bill=qty*45;
				System.out.println("Your bill="+bill);
			break;
			case 5:
				System.out.println("BYE.....");
				System.out.println("\nThank you for visit my Hotel");
			break;
			default:
			System.out.println("\nInvalid order");
			break;
		}

		if(bill>=200)
		{
			discount=bill*0.10;
			System.out.println("\nHurray !!! You got Discount ="+discount);
			netbill=bill-discount;
			System.out.println("\nYour bill ="+netbill);
		}
		else 
		{
			System.out.println("\nSorry!!! You are not applicable for Discount ");
		}
	}
}
		
		