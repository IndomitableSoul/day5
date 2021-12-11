package com.day5;

class PS3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		long power = 1;
		for (int i = 0; i <= n; i++) {
			if(i==0)
				System.out.println("2 to the power of "+i+" is "+power);
			else {
				power = power*2;
				System.out.println("2 to the power of "+i+" is "+power);
			}
		}
		
	}
}