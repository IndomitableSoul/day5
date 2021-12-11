package com.day5functionalprograms;

import java.util.Iterator;
import java.util.Scanner;

public class PS1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows");
	int m = sc.nextInt();
	System.out.println("Enter number of colomns");
	int n = sc.nextInt();
	int[][] matrix = new int[m][n];
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.println("Enter a number");
			matrix[i][j] = sc.nextInt();
			
		}
	}
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
}
}
