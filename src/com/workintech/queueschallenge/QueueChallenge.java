package com.workintech.queueschallenge;

import java.util.*;

public class QueueChallenge {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase(Locale.ENGLISH);
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        StringBuilder reversedStr = new StringBuilder();
        StringBuilder newStr = new StringBuilder();

        for (char oneCharacter : str.toCharArray()) {
            stack.push(String.valueOf(oneCharacter));
        }

        for (char oneCharacter : str.toCharArray()) {
            queue.add(String.valueOf(oneCharacter));
        }

        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }


        while (!queue.isEmpty()) {
            newStr.append(queue.poll());
        }
        return newStr.toString().equals(reversedStr.toString());

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("I did, did I?"));
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("Was it a car or a cat I saw ?"));
    }


}
