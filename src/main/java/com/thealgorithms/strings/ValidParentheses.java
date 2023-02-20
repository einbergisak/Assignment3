package com.thealgorithms.strings;
//        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//        An input string is valid if:
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.


import java.util.*;

public class ValidParentheses {
	public static HashSet<String> branchesReached = new HashSet<>();
	public static boolean isValid(String s) {
		char[] stack = new char[s.length()];
		int head = 0;
		for(char c : s.toCharArray()) {
			branchesReached.add("1.1");
			switch(c) {
				case '{':
					// Requirement: the input is "{".
					branchesReached.add("1.2");
				case '[':
					// Requirement: the input is "[".
					branchesReached.add("1.3");
				case '(':
					// Requirement: the input is "(".
					branchesReached.add("1.4");
					stack[head++] = c;
					break;
				case '}':
					// Requirement: the input is "}".
					branchesReached.add("1.5.1");
					if(head == 0 || stack[--head] != '{') {
						// Requirement: head is 0 OR stack[--head] is not '{'.
						branchesReached.add("1.5.2");
						return false;
					}
					break;
				case ')':
					// Requirement: the input is ")".
					branchesReached.add("1.6.1");
					if(head == 0 || stack[--head] != '(') {
						// Requirement: head is 0 OR stack[--head] is not '('.
						branchesReached.add("1.6.2");
						return false;
					}
					break;
				case ']':
					// Requirement: the input is "]".
					branchesReached.add("1.7.1");
					if(head == 0 || stack[--head] != '[') {
						// Requirement: head is 0 OR stack[--head] is not '['.
						branchesReached.add("1.7.2");
						return false;
					}
					break;
			}
		}
		return head == 0;
	}
}