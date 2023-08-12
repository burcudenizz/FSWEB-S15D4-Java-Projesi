package com.workintech.decimaltobinary;

import java.util.Stack;

public class DecimalToBinary {

    public static int decimalToBinary(int number) {
        StringBuilder str = new StringBuilder();
        Stack<String> stack = new Stack<>();
        StringBuilder reversedStr = new StringBuilder();
        while (number > 0) {
            str.append(number % 2);
            number = number / 2;
        }

        char[] charArr = str.toString().toCharArray();

        for (char c : charArr) {
            stack.push(String.valueOf(c));
        }
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return Integer.parseInt(reversedStr.toString());
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
        System.out.println(decimalToBinary(6));
        System.out.println(decimalToBinary(13));
    }

}
