package day05nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

	/*
	Ask user to enter a password
    If the initial of the password is uppercase then check if it is ‘A’ or not.
    If it is ‘A’ the output will be “Valid Password”
    otherwise the output will be “Invalid Password”
    For example; Ali ==> Valid password     -   Mark ==> Invalid
    If the initial of the password is lowercase then check if it is ‘z’ or not.
    If it is ‘z’ the output will be “Valid Password”
    otherwise the output will be “Invalid Password”
    For example; zoo ==> Valid password     -   john ==> Invalid 
	*/
	// Note: Indexs start from zero ornek : Alican A=0 L=1 i=2 C=3.... 
	// Eng: Every character in a String has index and first character starts with zero.
	// Index of last character in a String equals "the number of characters -1"
	public static void main(String[] args) {

		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the password...");
	String pwd = scan.next();
	
	
	if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') {
		
		if(pwd.charAt(0)=='A') {
			System.out.println(pwd + " is a valid password");
		}else {
			System.out.println(pwd + " is not a valid password");
		}
		
	}else if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z') {
		if(pwd.charAt(0)=='z') {
			System.out.println(pwd + " is a valid password") ;
			
		}else {
			System.out.println(pwd + " is not a valid password");

		}
	}else {
		System.out.println("First character should be letter...");
	}

	}

}
