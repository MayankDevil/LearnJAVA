package test;

import java.util.Scanner;

public class Test
{
	public static void main(String[] arg)
	{
		try
		{
			Scanner input = new Scanner(System.in);

			int n1,n2,n;
			System.out.println("\n\t Welcome Master Mayank....");

			System.out.print("Enter Number 1 : ");
			n1 = input.nextInt();
			System.out.print("Enter Number 2 : ");
			n2 = input.nextlnt();
			n=n1+n2;
			System.out.println("Result"+n);
			System.exit(0);
		}
		catch(Exception error)
		{
			System.out.println(error);
		}
	}
}
//	TODO code application logic here