package com.mypackage;

import java.io.*;

public class TablesTest
{
	public static void main(String[] args)
	{
		
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number");
			int num = Integer.parseInt(reader.readLine());
			Tables t = new Tables();
			t.printTable(num);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}