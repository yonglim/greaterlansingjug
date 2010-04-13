package org.gljug;

import java.util.LinkedList;
import java.util.List;

public class Tst05GenericsProblem {

	public static void main(String[] args) {
		List<String> ls = new LinkedList<String>();
		
		// We can force eclipse to flag this as problem instead of a warning
		// Project Properties / Java Compiler / Error/Warnings 
		//   under Generic Type / change from Warning to Error 
		List lraw = ls;
		
		//  Runtime Error here
		lraw.add(new Integer(4)); 
		String s = ls.iterator().next();
		System.out.println (" string : " + s);
	}


}

