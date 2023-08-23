package org.launchcode;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Chicken Caesar Salad", 12.99);
        MenuItem item2 = new MenuItem("Chocolate Lava Cake", 6.99);

        menu.addItem(item1);
        menu.addItem(item2);

        System.out.println("Menu last updated: " + menu.getLastUpdated());

        // Rest of the code remains the same
    }
}
