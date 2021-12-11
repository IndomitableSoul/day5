package com.day5;

import java.util.Scanner;

public class PS5 {
   public static boolean isPrime(int i) {
	   int count = 0;
	   for(int j=1;j<i/2;j++) {
		   if(i%j==0)
			   count++;
	   }
	   if(count>1)
		   return false;
	   else
		   return true;
   }
   public static void primeFactors(int num) {
	   for (int i=2;i<=num/2;i++) {
		   if(num%i == 0) {
		   if(isPrime(i))
			   System.out.println(i);
	   }
	   }
   }
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter The Number");
	   int num = sc.nextInt();
	   primeFactors(num);
}
}
