package org.launchcode;

public class Main {
    public static <CD> void main(String[] ignoredArgs) {
        // Declare and initialize a CD and a DVD object
        CD myCd = new CD("My CD", 700, "CD-specific field");
        DVD myDvd = new DVD("My DVD", 4700, "DVD-specific field");

        // Call each CD and DVD method to verify that they work as expected
        myCd.spinDisc();
        myDvd.spinDisc();

        // Call other methods as needed
    }
}
