import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(7);
        numbers.add(8);
        numbers.add(13);
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        numbers.add(12);

        int sumOfEvens = sumOfEvenNumbers(numbers);
        System.out.println("Sum of even numbers: " + sumOfEvens);

        ArrayList<String> name = new ArrayList<>();
        name.add("Sonal");
        name.add("Antim");
        name.add("Solina");
        name.add("Simi");
        /*System.out.println("enter a name length:");
        int  = name.nextInt();*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word length to search: ");
        int wordLength = scanner.nextInt();

        printWordsWithLength(name,wordLength);
    }

    public static void printWordsWithLength(ArrayList<String> list, int length) {
        System.out.println("Words with length " + length + ":");
        for (String word : list) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }


            // Now print the ArrayList

    public static int sumOfEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
