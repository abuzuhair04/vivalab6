package main;

import java.util.Scanner;

public class VivaQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program determine a Strong number");
		System.out.println("---------------------");
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		int clone = input;
		int sum = 0;
		String status;
		
		while(clone > 0) {
			int digit = clone % 10;
			int fact = factorial(digit);
			sum += fact;
			clone = clone / 10;
		}
		
		if (sum == input) {
			status = "a Strong number";
		}else {
			status = "not a Strong number";
		}
		
		System.out.println(input + " is " + status);
	}
	
	static int factorial(int n) {
		int product = 1;
		for(int i = 2;i <= n;i++) {
			product *= i;
		}
		
		return product;
	}

}
