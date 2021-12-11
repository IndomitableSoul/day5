package com.day5functionalprograms;

import java.util.Scanner;

public class PS4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double delta = Math.sqrt(Math.pow(b*b - (4*a*c),2));
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println(root1);
		System.out.println(root2);
		
	}
}
