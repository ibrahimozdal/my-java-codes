package day02variablesscanner;
public class Day02TypeCasting {
    /*
        Type Casting: we want to convert a number primitive data type to another number primitive type
        Number Primitive Data Types : byte < short < int < long < float < double
        Note: If you put large box into a small box large box may be broken. Java does not want to do it.
     */
	public static void main(String[] args) {
		// 1 - Auto Widening Type Casting : If you change small primitive data type to larger it is called Auto Widening Casting
		byte b1 = 12;
		short s1 = b1;
		
		int i1 = 123;
		float f1 = i1;		
		// 2 - EXPLICIT NARROWING TYPE CASTING
	    // ==> i know the process ,its my task. This is EXPLICIT NARROWING TYPE CASTING ==> Change large data type to smaller type
		  double d1 = 2.34;
		  float f2 = (float)d1;		  
		  long l1 = 234;
		  byte b2= (byte)l1;
		  System.out.println(l1); //234
		  System.out.println(b2); //-22

		  // How to convert "primitive data type" to "Wrapper Class"
		  // int ==> Integer              Integer ==> int
		  // If you  convert primitive to wrapper it is called "Auto Boxing"
		  // If you  convert wrapper to primitive it is called "UnBoxing"		  
		  int i2 = 123;		  
		  Integer i2Wrapper = i2;		  
		  Integer i3Wrapper = 1234;
		  int i3 = i3Wrapper;	
    }
}