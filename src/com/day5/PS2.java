package com.day5;

import java.util.Scanner;

public class PS2 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the Year: ");
	   int year = scanner.nextInt();
	   
	   if(year>=1000 && year<=9999) {
		   boolean leap = false;
		   
		   if(year%4 == 0) {
			   
			   if(year%100 == 0) { 
				   
				   if (year % 400 == 0)
					   leap = true;
				   else
					   leap = false;
			   }
			   
			   else
				   leap = true;
		   }
		   else
			   leap = false;
		   
		   if(leap)
			   System.out.println(year + " is leap");
		   else
			   System.out.println(year + " is not leap");
		   scanner.close();
	   }
}
}
