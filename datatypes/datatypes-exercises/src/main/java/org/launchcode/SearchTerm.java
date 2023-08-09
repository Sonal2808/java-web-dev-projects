package org.launchcode;
import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a term to search for: ");
        String searchTerm = input.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive search
        input.close();

        boolean found = sentence.toLowerCase().contains(searchTerm);

        if (found) {
            int index = sentence.toLowerCase().indexOf(searchTerm);
            int length = searchTerm.length();

            System.out.println("Search term found at index: " + index);
            System.out.println("Length of search term: " + length);

            // Remove the word from the sentence and print the updated sentence
            String updatedSentence = sentence.replaceFirst("(?i)" + searchTerm, ""); // Case-insensitive replacement
            System.out.println("Updated sentence:\n" + updatedSentence);
        } else {
            System.out.println("Search term not found.");
         }
    }
}
