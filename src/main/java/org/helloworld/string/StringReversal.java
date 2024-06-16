package org.helloworld.string;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        String[] words = input.split("");
        StringBuilder output = new StringBuilder();
        for(int i= words.length-1; i>=0; i--) {
            output.append(words[i]);
        }
        System.out.println(output.toString());
    }
}
