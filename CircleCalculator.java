package day14statickeywordandarrays;
	/*
	 Static Block: 1) We use static block to initialize static variables
	 				2) If you use static block to initialize a static variable,
	 				it will be initialized before everything inside the class
	 				3) If there are multiple static blocks, Java runs and read from top to down	 				
	 */
public class CircleCalculator {
	
	static String nameOfShape="Circle";
	static double pi;
	static String unit;
	
	static {
		pi=3.14;
		System.out.println("Static Block 1");
	}	
	static {
		unit="cm";
		System.out.println("Static Block 2");
	}	
	public CircleCalculator() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		method();
		CircleCalculator obj= new CircleCalculator();
	}	
	public static void method() {
		System.out.println("Method");
	}
}