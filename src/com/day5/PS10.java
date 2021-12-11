package com.day5;

import java.util.Scanner;

public class PS10 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 3 numbers");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
			if(x>y && x>z)
				System.out.println(x+ " is gratest");
			else if (y>z)
				System.out.println(y+ " is greatest");
			else
				System.out.println(z+ " is greatest");
			scanner.close();
		}
}
