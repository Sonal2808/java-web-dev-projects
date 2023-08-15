public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        System.out.println("All array elements:");
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("only odd elements");
        for (int i : numbers) {
            if (i % 2 != 0)
                System.out.println(i);

            String inputString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

            // Split the inputString using space as delimiter
            String[] words = inputString.split(" ");
            for (String word : words) {
                System.out.println(word);
                String[] sentences = inputString.split("//");
                for (String sentence : sentences) {
                    System.out.println(word);

                }
            }


        }
    }
}