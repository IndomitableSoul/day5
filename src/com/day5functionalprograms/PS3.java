package com.day5functionalprograms;

import java.util.Scanner;

public class PS3 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("the distance is "+ distance);
	}
}
