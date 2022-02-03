package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement03Deneme {

	public static void main(String[] args) {
    // Type a code to print its season after getting a month from user
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter a month");
		String month = scan.next().toLowerCase();
		
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("It is in Spring");
		} else if ( month.equals("June") || month.equals("July")|| month.equals("Ausgust")) {
			System.out.println("It is in Summer");
			
		} else if ( month.equals("September") || month.equals("October")|| month.equals("November")) {
			System.out.println("It is in Fall");	
			
		} else if ( month.equals("December") || month.equals("January")|| month.equals("February")) {
			System.out.println("It is in Winter");
												
		} else {
			System.out.println("Write the month correctly");
		}
		
		scan.close();
		
	}
}