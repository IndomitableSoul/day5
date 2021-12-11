package com.day5;

import java.util.Scanner;

public class PS4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Till where do you want the Harmonic Value");
		double N = scanner.nextDouble();
		double harmonics = 0;
		for(double i = 1; i<=N; i++) {
			harmonics = harmonics + 1/i;
		}
		System.out.println(harmonics);
	}
}
