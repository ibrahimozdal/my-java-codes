package day04concatenationifstatement;

import java.util.Scanner;

public class IfSatatement01Deneme {

	public static void main(String[] args) {
        // If it rains no picnic tomorrow in english
		// If (it rains) {no picnic tomorrow} in Java
		//      if condotion           if body
		// If condition is true, then if body runs, otherwise it does not run
		
		// 1. Example: Get a number from user. If the number is even, print "Even" on the console.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("Even");
		}
		
		// Second Example:  Get a number from user. If the number is "odd", print "Odd" on the console
		
        if	(num1%2 !=0) {
        System.out.println("Odd");	
        }
	
		// third example : Get a number from user. If they are equal to each other, print "Equal" on the console.
		
		if (num1==num2 ) {
			System.out.println("Equal");
		}
          scan.close();
        
	}

}
