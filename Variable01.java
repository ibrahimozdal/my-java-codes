package day01variables;

public class Variable01 {

	/*
	1) Project==> Class ==> Variables + Methods 
	2) How to create "variables"
	   a) Type data type
	   b) Type a name for the variable
	   c) "="
	   d) Value
	3) Data Types   
	   a) "int" ==> integer: Whole numbers like 2, 132, -54, 0
	   b) "double" ==> decimals:Range is larger
	   c) "float"  ==> decimals:Range is smaller than double`s range
	*/
	/*
	   Note: If you create a variable inside a method, you should "initialize" it.
	        "int price;" means you initialized the variable --->degiskeni baslat
	        "=100" means you initialized the variable   --->degiskeni baslat
	   Note: If you want to see "default values" create the variables outside the methods.   default value=varsayilan deger
	   Note: If a method is static, everything you used in the method must be static
	   Note: If you do not assaign any value for a variable, Java uses "default values"for them. Default values for
	         a) int    ==> 0
	   Note: int's are whole numbers from -2.147.483.648 to 2.147.483.647      
	         b) double ==> 0.0
	         c) float  ==> 0.0
	         	   Note: When you assign a value for a float variable use "f" or"F" at the end
	         d) char ==> nothing or '/u000'
	         e) byte ==>  0
	   Note: Byte's are whole numbers from -128 to 127
	         f) short ==> 0
	   Note: Short's are whole numbers from -32768 to 32767       
	         g) long ==> 0
	   Note: long's are whole numbers from -.223.372.036.854.755.808 to 9.223.372.036.854.755.807
	         h) boolean ==> false
	   Note: data type is used just for "true" and "false" values
	   Note: order the number data types in ascending order =  artan oran
	          byte < short< int < long <false < double
*/	
	static int price2 ; 
	static double minSalary; 
    static float hourlySalary;
	static char single;
	byte age = 53;
	static boolean isOld;
	
	
	public static void main(String[] args) {
		// If you create a variable inside a static method Java makes it static automatically
		
		 int price1 = 100; 
	     double salary = 2.34;
		 float weeklySalary =1234f;
		 char initial = 'S' ; 
		 byte age = 53;
	     short populationOfAVillage = 25000 ;
	     boolean isNew = true;
	     boolean isRetired = false;
	     String name = "ibrahim + 123457 password";
		 

		 
		 System.out.println(price1);		 
		 System.out.println(salary) ;
		 System.out.println(price1 * salary) ;
		 System.out.println(price2) ;
		 System.out.println(minSalary);
		 System.out.println(hourlySalary);
		 System.out.println(weeklySalary);
		 System.out.println(initial);
		 System.out.println(single); 
		 System.out.println(age);
	     System.out.println(populationOfAVillage);	
	     System.out.println(isOld);
         System.out.println(name);
	     
	     
	     
	     
	}
}	
