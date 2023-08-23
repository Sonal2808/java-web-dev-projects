package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Pasta", 12.99, "Delicious pasta dish", "Main Course", true);
        MenuItem item2 = new MenuItem("Salad", 8.99, "Fresh garden salad", "Appetizer", false);
        MenuItem item3 = new MenuItem("Cheesecake", 6.99, "Creamy cheesecake dessert", "Dessert", true);
        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

       /* System.out.println("Initial Menu:");
        menu.printMenu();

        System.out.println("\nItem 2 is new? " + item2.isNew());

        menu.removeMenuItem(item2);

        System.out.println("\nUpdated Menu:");
        menu.printMenu();
    }
    }*/
        MenuItem duplicateItem = new MenuItem("Salad", 8.99, "Fresh garden salad", "Appetizer", false);
        menu.addMenuItem(duplicateItem);  // This will print a warning message

        System.out.println("Updated Menu:");
        menu.printMenu();
    }
}
