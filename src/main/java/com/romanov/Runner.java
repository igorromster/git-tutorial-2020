package com.romanov;

public class Runner {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (isEven(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isEven(int a) {
		return a % 2 == 0;
	}
}
