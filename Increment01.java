package day03scannerincrementdecrement;

public class Increment01 {

	public static void main(String[] args) {
		// Increment is to increase the value of a number variable by addition "+" and multipication "x"
		// First way:
		
		int num1=3;
		num1 = num1+2;
		
		System.out.println(num1); //5
		num1=num1+10;
		System.out.println(num1); //15
		
		num1=num1*2; //30
		System.out.println(num1); //30
		
		// Second way;
		num1 +=4; // this is same as num1=num1+4     CAREFUL : += MUST BE TOGETHER (DONT SEPERATE OPERATION SIGN AND EQUALITY SIGN)
		System.out.println(num1); //34
		
		num1 *=3; // this is same as num1=num1*3     CAREFUL : += MUST BE TOGETHER (DONT SEPERATE OPERATION SIGN AND EQUALITY SIGN) 
		System.out.println(num1); //102
		
		// Third way is only for increasingby 1
		num1++;
		System.out.println(num1); //103
				
	}

}
