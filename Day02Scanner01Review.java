package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner01Review {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hey user enter your age");
		int age = 25;
		System.out.println(age);
		System.out.println("The user entered age:" + age);
		
		
		System.out.println("Hey user enter your first name");
		
//		String firstName = scan.next();
//		System.out.println("The user entered firstname: " + firstName);
		
		System.out.println("Hey user enter your address");
		String address = scan.nextLine();
		System.out.println("User entered address: "+address);
		
		
		
		
		
		scan.close();
		
	}

}
