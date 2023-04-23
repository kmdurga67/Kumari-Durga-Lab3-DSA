package com.greatlearning.dsa.client;

import java.util.Scanner;

import com.greatlearning.datastructureassignment.BalancingBrackets;

public class Client {

	public static void main(String[] args) {
		
		BalancingBrackets inputBracket = new BalancingBrackets();
		
		//String input = "([[{}]]))";   //input for unbalanced brackets
		
		String input = "( [[{}]])";
		
		boolean result = inputBracket.isBalanaced(input);
		
		if(result == true) {
			System.out.println("The entered String has Balanced Brackets ::" + input);
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets ::" + input);
		}
		
//		boolean flag = true;
//		Scanner sc = new Scanner(System.in);
//		while(flag) {
//			System.out.println("Enter the input  or q to quit::");
//			String input = sc.next();
//			if (input.equals("q")) {
//				flag = false;
//				continue;
//			}
//			boolean result = BalancingBrackets.isBalanaced(input);
//			System.out.println("Input is balanced ? "+ result);
//		}
//			sc.close();


	}

}
