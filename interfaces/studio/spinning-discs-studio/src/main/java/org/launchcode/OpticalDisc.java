package org.launchcode;

public interface OpticalDisc {
    // Declare constant fields (if any)
    double MINIMUM_SPIN_SPEED = 200;
    double MAXIMUM_SPIN_SPEED = 1600;

    // Declare method signatures for shared behaviors
    void spinDisc();
    void storeData();
    void writeDataWithLaser();
    void readDataWithLaser();
    void reportInformation();
    // Add the two additional behaviors
}
