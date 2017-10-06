/****************************************************************************** 
 *  Purpose: to find N distinct Coupon numbers;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   5-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;

public class SumOfInteger
{

	public static void main(String args[])
	{
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter size of array");
	int size = scanner.nextInt();
	int []array = new int[size];
	int count = 0;

	System.out.println("enter "+size+" elements");
	for(int i=0;i<size;i++)
	{
		array[i]= scanner.nextInt();
	}

	int length = array.length;

	for(int i=0; i<length-2; i++)
	{
		for(int j=i+1; j<length-1; j++)
		{
			for(int k=j+1; k<length; k++)
			{
			if(array[i]+array[j]+array[k] == 0)
			{
			System.out.println("distinct riplets are "+array[i]+" "+array[j]+" "+array[k]);
			count++;
			}
			}
		}
	} 

	System.out.println("number of distinct triplets are "+count);
	}
}
	
