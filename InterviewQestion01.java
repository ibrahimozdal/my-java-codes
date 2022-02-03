package day03scannerincrementdecrement;

import java.util.Scanner;

public class InterviewQestion01 {

	public static void main(String[] args) {
    /*
     *       Swapping two numbers:
		 Get two numbers from user then swap/exchange them.
		 User ==> a=5, b=10, then after swapping a=10, b=5.
    */		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = scan.nextInt();
		System.out.println("Enter the second number");
		int secondNum = scan.nextInt();
		System.out.println("Before Swap, The first number: " +firstNum+  " ,The second number:" + secondNum);
		
		
		// First way;                 kodu kapattik 2. kodu bulmak icin
//		int temp = 0;
//		temp = firstNum;
//		firstNum = secondNum;
//		secondNum = temp;
		
		
		System.out.println("After Swap, The first number: " +firstNum+" , The second number:" + secondNum);		
		// Second way 
		
		firstNum = firstNum+secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		System.out.println("After Swap, The first number: " +firstNum+" , The second number:" + secondNum);
				
		scan.close();
	
	}

}
