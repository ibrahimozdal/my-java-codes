package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner02Review {

	public static void main(String[] args) {
	//	Get 3 number from user and print the sum on the console...
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Hey user write first number");
		int firstNumber =scan.nextInt() ;
		
		System.out.println("Hey user write second number");
		int secondNumber = scan.nextInt() ;
		
		System.out.println("Hey user write third number");
        int thirdNumber = scan.nextInt() ;
         
        System.out.println("The sum : " + ( firstNumber+secondNumber+thirdNumber));

		
		
		
		scan.close();
		
	}

}
