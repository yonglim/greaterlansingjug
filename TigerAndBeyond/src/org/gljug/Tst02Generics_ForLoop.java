package org.gljug;

import java.util.ArrayList;
import java.util.Iterator;

public class Tst02Generics_ForLoop {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		System.out.println("\n Printing string list :");
		for(String str:list)
		{
			System.out.println (" element : " + str);
		}

		int[] intArray = new int[] {1,2,3};
		
		System.out.println("\n Printing number array :");
		for(int i : intArray) {
			System.out.println (" element : " + i);
		}
	}
}
