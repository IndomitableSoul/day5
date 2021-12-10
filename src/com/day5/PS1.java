package com.day5;

import java.util.Scanner;

public class PS1 {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int flips = 0;
	   double tails = 0;
	   double heads = 0;
	   System.out.println("Enter the number of times to flip the coin");
       flips = scanner.nextInt();
	  
	   for(int i=1;i<=flips;i++) {
	   double outcome = Math.random();
	   if(outcome<0.5) {
		   tails++;
	      }
	   else {
		   heads++;
	       }
	   }
	   System.out.println("total tails: "+tails);
	   System.out.println("total heads: "+heads);
	   double percentageOfTails = (tails/flips)*100;
	  
	   double percentageOfHeads = (heads/flips)*100;
	   System.out.println("Percentage of Tails is: "+percentageOfTails+"%");
	   System.out.println("Percentage Of Heads is:  "+percentageOfHeads+"%");
	   scanner.close();
    }
}
