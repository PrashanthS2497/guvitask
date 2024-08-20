package task8;

import java.util.Scanner;

public class SeniorCitizen {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if (age >= 60) {
            System.out.println("Person is a senior citizen.");
        } else {
            System.out.println("Person is not a senior citizen.");
        }
        scanner.close();
    }
}
