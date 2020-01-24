package com.mariiapasichna;

import java.util.Stack;

public class BracketBalance {

    public static void isBalance(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '<' || s.charAt(i) == '[' || stack.empty()) {
                stack.push(s.charAt(i));
            } else {
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.peek().equals('(')) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;
                    case '}':
                        if (stack.peek().equals('{')) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;
                    case '>':
                        if (stack.peek().equals('<')) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;
                    case ']':
                        if (stack.peek().equals('[')) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                        break;
                    default:
                        throw new RuntimeException("Unexpected char: " + s.charAt(i));
                }
            }
        }
        if (stack.empty()) {
            System.out.println(s + " - Yes");
        } else {
            System.out.println(s + " - No");
        }
    }
}