package org.gljug;

public class TstPrintVarArgs
{

	public static void main(String[] args)
	{
//		http://java.sun.com/j2se/1.5.0/docs/api/java/util/Formatter.html
		// demonstrating varargs and printf
		
		// precision is 2 decimal place 
		System.out.printf("display decimal %,6.2f\n", 24566.345 );
		
		// width is 6 ... so this is padded
		System.out.printf("display decimal %,6.2f\n", 6.345 );
		String str = String.format("%,6.2f", 6.345);
		System.out.println ("string length : " + str.length());
		
		// %d tell it where to put the variable 
		System.out.printf("%d + %d = %d\n", 2,3, 2+3);
		
		// 5 and 6 is NOT displayed
		System.out.printf("%d + %d = %d\n", 2,3, 2+3, 5, 6);
		
		//problem here not enough variable ... no check for variables
		System.out.printf("%d + %d = %d\n", 2,3);
	}
}