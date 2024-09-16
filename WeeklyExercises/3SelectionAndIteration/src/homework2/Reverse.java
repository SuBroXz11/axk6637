package homework2;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence you want to reverse: ");
        String reverse = scanner.nextLine();
        String reversed = reverseString(reverse);
        System.out.print("Reverse of the sentence provided is \n" + reversed);
        scanner.close();
    }

    public static String reverseString(String str) {
        // Split the input string into words
        String[] words = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        // Reverse each word and append it to the reversed sentence
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Trim any trailing space and return the reversed sentence
        return reversedSentence.toString().trim();
    }
}
