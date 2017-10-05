/****************************************************************************** 
 *  Purpose: to find N distinct Coupon numbers;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;

public class RandomCoupons
{	
	static int Coupon = 0 , newNumber =0;
	public static void main(String[]args)
	{	
	Scanner scanner = new Scanner(System.in);
	System.out.println("how many distinct coupon number do you want");
	int input = scanner.nextInt();
	
	while(Coupon != input)
	{
		int random = 1 + (int)(Math.random() * 9); 
		String str = Integer.toString(random);
		String randomstr = Integer.toString(random);
		int len = str.length();	
		for(int i=0;i<len; i++)
		{
			if(str.charAt(i)==randomstr.charAt(i))
			{
			newNumber++;
			System.out.println(newNumber);
			}
			if(newNumber == 0);
			{
			System.out.println(newNumber);
			Coupon++;
			}
			len++;
		}
				
	}
//System.out.println(newNumber);
//System.out.println(str);
//System.out.println(len);



}
}
