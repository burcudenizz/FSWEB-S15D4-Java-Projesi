package com.workintech.stackchallenge;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class StackChallenge {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase(Locale.ENGLISH);
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        Stack<String> stack = new Stack<>();
        StringBuilder reversedStr = new StringBuilder();

        for (char oneCharacter : str.toCharArray()) {
            stack.push(String.valueOf(oneCharacter));
        }

        System.out.println("stack: " + stack);

        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        System.out.println("reversed-str: " + reversedStr);
        return str.equals(reversedStr.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("I did, did I?"));
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Was it a car or a cat I saw ?"));
    }
}