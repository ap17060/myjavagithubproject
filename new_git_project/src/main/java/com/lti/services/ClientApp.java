package com.lti.services;

import java.util.Scanner;

//import com.lti.services.ImplProduct;


public class ClientApp {
	public static void main(String args[])
	{
		Product p =new Product(1,"charger",100);
		System.out.println(p);
		Scanner sc= new Scanner(System.in);	
		 String ans;
		 int no;
		do {
			System.out.println("***** DMART  Services ****");
			System.out.println("1. add product ");	
			System.out.println("2. View Product   ");			
			System.out.println("Pls enter your choice: ");
			
			no=sc.nextInt();			
					switch(no)
					{
					case 1: System.out.println("case 1");
					
					ImplProduct service =new ImplProduct();
					
					System.out.println("enter id name and cost");
					
					int pid =sc.nextInt();
					String pname =sc.next();
					int pcost = sc.nextInt();
					
					Product p1 =new Product(pid,pname,pcost);
					service.addProduct(p1);
					break;
					case 2: System.out.println("case 2");
							break;							
					}	
					System.out.println("wish to continue? type y/n  ");
					ans = sc.next();
					}
		while(ans.equals("Y")||ans.equals("y"));							
					System.out.println("Thanks and visit again.");							
		sc.close();}	
}
