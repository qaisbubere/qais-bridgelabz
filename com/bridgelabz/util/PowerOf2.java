/****************************************************************************** 
 *  Purpose: to find power of 2
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;

public class PowerOf2
{
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the power vlaue");
	int power = scanner.nextInt();
	
	if(power>0 && power<31)
	{	
	for(int i=1; i<=power; i++)
		{
		double Answer = Math.pow(2,i);
		System.out.println("2 ^ "+i+" = "+Answer);
		}
	}
	else
	{
	System.out.println("enter the number between 1 and 30");
	}
}
}
