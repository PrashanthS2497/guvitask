package task8;

import java.util.Scanner;

public class Prime {
	 public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number:");
	        int num = scanner.nextInt();
		 
	        boolean isPrime = true;
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
		}
	    }
}
