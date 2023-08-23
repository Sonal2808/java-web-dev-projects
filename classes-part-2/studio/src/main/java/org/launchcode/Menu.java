package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private Date lastUpdated;
    private final List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    /*public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }*/
    public void addMenuItem(MenuItem menuItem) {
        if (!menuItems.contains(menuItem)) {
            menuItems.add(menuItem);
            lastUpdated = new Date();
        } else {
            System.out.println("Item already exists in the menu: " + menuItem.getName());
        }
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
        lastUpdated = new Date();
    }

    /*public Date getLastUpdated(){
        return lastUpdated;
    }*/

    public void printMenu() {
        System.out.println("Menu:");
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " - " + menuItem.getPrice() + " - " + menuItem.getCategory());
        }
    }
}