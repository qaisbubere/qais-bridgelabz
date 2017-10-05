/****************************************************************************** 
 *  Purpose: to find prime factor of a given number
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;

public class PrimeFactor
{	
	public static void main(String[]args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a number");
	int Number = scanner.nextInt();
	
	for(int i=1; i*i<=Number; i++)
	{
	if(Number%i==0)
	{
	System.out.println(i);
	}
	}
}
}
