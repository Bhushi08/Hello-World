package org.helloworld.string;

import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        System.out.println("There are "+words.length+" words in the given sentence");
    }
}
