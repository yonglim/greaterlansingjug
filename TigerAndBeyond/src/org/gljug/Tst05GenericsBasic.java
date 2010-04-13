package org.gljug;

import java.util.ArrayList;
import java.util.Vector;

public class Tst05GenericsBasic {

	public static void main(String[] args) {
		Vector<String> vector1 = new Vector<String>();
		// Compile error! Compile Time check, no runtime classCastException
//		vector1.add(new Integer(5)); 
		vector1.add("someString");
		String s = vector1.get(0); // No casting needed
		
		System.out.println(s);
		
		
		ArrayList<Number> list1 = new ArrayList<Number>(); 
		
		// compile time error
//		ArrayList<Object> list2 = list1;
		
		// compile time error
//		ArrayList<Integer> list3 = list1;

	}

}
