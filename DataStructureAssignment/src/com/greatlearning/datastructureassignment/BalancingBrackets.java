package com.greatlearning.datastructureassignment;

import java.util.Stack;

public class BalancingBrackets {

	public static boolean isBalanaced(String input) {

		Stack<Character> bracketStack = new Stack<>();

		char[] brackets = input.toCharArray();

		for(int i=0;i<brackets.length;i++) {
			char current = brackets[i];

			if(current == '(' || current == '{' || current == '[') {
				bracketStack.push(current);
				continue;
			}
			
			if(bracketStack.isEmpty()) {
				return false;
			}

			//start popping elemnts from the stack.
			//if there is not matching closing bracket, return false
			char popChar;

			switch(current) {
			case')':
			{
				popChar = (char)bracketStack.pop();
				if(popChar == '{' || popChar == '[')
					return false;
				break;
			}
			case']':
			{
				popChar = (char)bracketStack.pop();
				if(popChar == '{' || popChar == '(')
					return false;
				break;
			}
			case'}':
			{
				popChar = (char)bracketStack.pop();
				if(popChar == '(' || popChar == '[')
					return false;
				break;
			}
			}

		}

		return bracketStack.isEmpty();

	}

}
