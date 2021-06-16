package sathish;

import java.util.Scanner;

public class Que1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("Enter the input: ");
		Scanner sc = new Scanner(System.in);
		int nVal = sc.nextInt();
		
		
		for (int i=1;i<=nVal; i++)
		{
			for (int j=nVal;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}
