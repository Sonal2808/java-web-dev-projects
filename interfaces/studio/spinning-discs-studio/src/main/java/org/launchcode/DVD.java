package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    // Additional fields specific to DVD
    private String dvdField;

    // Constructor
    public DVD(String name, double storageCapacity, String dvdField) {
        super(name, storageCapacity);
        this.dvdField = dvdField;
    }

    // Implement and override interface methods
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + MINIMUM_SPIN_SPEED + " - " + MAXIMUM_SPIN_SPEED + " rpm.");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeDataWithLaser() {

    }

    @Override
    public void readDataWithLaser() {

    }

    @Override
    public void reportInformation() {

    }

    // Implement and override the other interface methods

    // Add getters, setters, and any custom methods needed for DVD
}
