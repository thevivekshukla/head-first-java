package com.mypackage;

public class Tables
{
	public void printTable(int n)
	{
		System.out.println(n +"'s table:");
		for (int i=1; i<=10; i++)
		{
			System.out.println(n*i);
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
}