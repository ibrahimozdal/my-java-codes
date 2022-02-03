package day05nestedifternary;

import java.util.Scanner;

public class IfElse01 {
     /*
       Type java code by using if-else if() statement.
       Write a program to check if a year is leap year or not.
       If the year is divisible by 100 then it must be divisible by 400. ==> 1600 is leap, but 1700 is not
       If a year is not divisible by 100 then it must be divisible by 4. ==> 2004 is leap year, but 2007 is not
     */
	/*
	 *  Note:  && means "and" : If you use "&&" between 2 things it means you want both.
	          For example; "tea && coffee" means I want both, just one of them will not be enough
	         
	         To get true && operation, all must be true. everything must be true.
	         true && true ==>true
	         true && false ==> false
	         false && true ==> false
	         false && false==> false
	         
	 * Note:  & means "and" : If you use "&" between 2 things it means you want both.
	         For example; "tea & coffee" means I want both, just one of them will not be enough
	         
	         To get true & operation, all must be true. everything must be true.
	         true & true ==>true
	         true & false ==> false
	         false & true ==> false
	         false & false==> false
	 
	 Note: && ile & farki; && eger ilk onerme yanlis ise ikinci onermeye gitmez bu da javayi hizlandirir. Ama ikiside ayni isi yapar.
	       tek fark & her iki kosuluda test eder  bu da javayi yavaslatir.
	       English; && and & do the same but
	                && does not check the second condition if the first condition is false.
	                & checks both conditions everytime, so , it makes slower java.
	      
     /*  Note: || means "or" If you use "||" between 2 things it means at least 1 of them is enough for you
             For example; "tea || coffee " means just tea, or just coffee, or both
             true || true ==>true
             true || false ==>true
             false || true ==>true
             false || false ==> false
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year to learn if it is leap or not...");
		int year = scan.nextInt();
		
		if (year<=0) {
			System.out.println("The year must be more than zero");
		}else if(year%100==0 && year%400==0) {
			System.out.println(year + " is a leap year");
				
		}else if(year%100!=0 && year%4==0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not leap year");
		}
		
		scan.close();
	}

}
