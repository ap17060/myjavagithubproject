package com.lti.user;

import java.util.Scanner;


public class ClientApp {
	public static void main(String args[])
	{
		Person p =new Person(1,"charger",100);
		System.out.println(p);
		 Scanner sc= new Scanner(System.in);	 
		 String ans;
		 int no;
		do {
			System.out.println("***** DMART  Services ****");
			System.out.println("1. Enter Product Info ");	
			System.out.println("2. View Product -customer  ");			
			System.out.println("Pls enter your choice: ");
			no=sc.nextInt();			
					switch(no)
					{
					case 1: System.out.println("case 1");
						break;
					case 2: System.out.println("case 2");
							break;							
					}	
					System.out.println("wish to continue? type y/n  ");
					ans = sc.next();
					}
		while(ans.equals("Y")||ans.equals("y"));							
					System.out.println("Thanks and visit again.");							
		}	
}
