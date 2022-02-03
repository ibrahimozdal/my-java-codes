package day02variablesscanner;

public class Day02WrapperClasses {	
	  /*
    Wrapper Class: Non - Primitive classes have many useful methods but primitive classes do not.
                   But having useful methods is very good. Because of that, Java created new "Non-Primitive Data" types
                   which have methods for primitive values.
                   That new data types are called "Wrapped Classes"
                   
                   Primitive Data                  Wrapper Class
                      boolean                        Boolean
                      char                          Character
                      byte                            Byte
                      short                           Short
                      int                            Integer
                      long                           Long
                      float                          Float
                      double                         Double
   */	
	public static void main(String[] args) {
    
		boolean primitiveBoolean = true;		
				
	    Boolean nonPrimitiveBoolean = true;
		nonPrimitiveBoolean.equals(true); //true
		System.out.println(nonPrimitiveBoolean.equals(true));//true
		System.out.println(nonPrimitiveBoolean.equals(false));//false
		
		char c1 = 'A';		
		Character c2 ='A';
		System.out.println(c2.charValue()); //A
		
		byte b1 = 12;		
		Byte b2 = 12;
        System.out.println(b2.MAX_VALUE);	//127	
        System.out.println(b2.MIN_VALUE);	//-128
              
        short s1 =123;                
        Short s2 = 120;
        Short s3 =123;
        Short s4 = 125;
       
        System.out.println(s2.compareTo(s3)); // compare 2 methods returns 0, if the numbers are equal to each other -3
        System.out.println(s2.compareTo(s4)); // s2 compareTo (s4) methods returned -5 for 123 and 125 
        System.out.println(s3.compareTo(s4));// s3 compareTo (s4) methods returned -2 for 123 and 125 
		
		Integer i1 = 1234;
		System.out.println(i1.MIN_VALUE);
		
		Long l1 = 12345L;
		System.out.println(l1.BYTES); // BYTES   64 bites = 8 bytes
		
		Float f1 = 1.34F;
		System.out.println(f1.BYTES); // bits ==> 4 bites  32 bytes = 4
		
		Double d1 = 23.456;
		System.out.println(d1.MAX_VALUE); //1.7976931348623157E308
	
	}

}
