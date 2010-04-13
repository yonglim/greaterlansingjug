package org.gljug;

import java.util.Arrays;

public class Tst01Arrays {


	public static void main(String[] args) {
		String[][] ticTacToe1 = { 
				{"X", "O", "O"},
				{"O", "X", "X"},
				{"X", "O", "X"}
			};
		String[][] ticTacToe2 = { 
				{"X", "O", "O"},
				{"O", "X", "X"},
				{"X", "O", "X"}
			};
		
		System.out.println(ticTacToe1);
		
		System.out.println(Arrays.deepToString(ticTacToe1));

		System.out.println(Arrays.deepEquals(ticTacToe1, ticTacToe2));

	}

}
