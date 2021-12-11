package com.day5;

public class PS7 {
	public static void main(String[] args) {
		int a = 12;
		int b =13;
		System.out.println("Before Swapping: a is "+a+" a is "+b);
		a = a - b;
		b = b + a;
		a = b - a;
		System.out.println("After Swapping: a is "+a+" a is "+b);
	}
}
