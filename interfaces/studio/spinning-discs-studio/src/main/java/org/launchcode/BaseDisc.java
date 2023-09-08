package org.launchcode;

public abstract class BaseDisc {
    // Declare fields used by both CD and DVD
    private String name;
    private double storageCapacity;

    // Constructors
    public BaseDisc(String name, double storageCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    // Getters and setters for shared fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // Custom methods (if any) used by both CD and DVD
}
