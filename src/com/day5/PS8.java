package com.day5;

import java.util.Scanner;

public class PS8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scanner.nextInt();
		if(n%2==0){
			System.out.println("Even Number");
		}
		else
			System.out.println("Odd Number");
	}
}
