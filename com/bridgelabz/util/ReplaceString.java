/****************************************************************************** 
 *  Purpose: replace the string with given username.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;

public class ReplaceString
{
public static void main(String[]args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a string");
	String input = scanner.nextLine();
	int length = input.length();
	if(length >=3)
	{
	System.out.println("hello "+input+". How are you? ");
	}
	else
	{
	System.out.println("name  must be atleast 3 characters");
	}
}
} 
