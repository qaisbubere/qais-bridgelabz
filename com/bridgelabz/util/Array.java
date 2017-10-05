/****************************************************************************** 
 *  Purpose: A library for reading and printing 2D array.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.OutputStreamWriter;
public class Array
{
	static int Rows, Columns,total,i,j;
	public static void main(String args[])throws Exception
	{
	Array a = new Array();
	a.IntInputArray();
	}
	
	public static void IntInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	File file = new File ("/home/bridgeit/Desktop/qais/com/bridgelabz/util/Array.java");
	
	System.out.println("enter number of rows");
	Rows = scanner.nextInt();
	System.out.println("enter number of columns");
	Columns= scanner.nextInt();
	total = Rows*Columns;

	
	int [][]array = new int [Rows][Columns];
	System.out.println("enter " +total+ " elements");
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	array[i][j] = scanner.nextInt();
	}
	}
	}
	
	public static void IntOutputArray()
	{
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	printwriter.println(array[i][j]);
	printwriter.flush();
	}
	}
	}
	 

	
}
