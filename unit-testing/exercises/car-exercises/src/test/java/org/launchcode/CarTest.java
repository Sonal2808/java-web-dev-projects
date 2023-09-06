package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car test_car;

    @BeforeEach
    public void initCar() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals( 10, test_car.getGasTankLevel(),.001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevelAfterDrivingWithinRange() {
        // Drive the car within its tank range
        test_car.drive(50); // Assuming the car's fuel efficiency is such that it can travel 50 miles with a full tank
        assertEquals(9, test_car.getGasTankLevel(),.001);

    }


    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test()
    public void testGasOverfillException() {
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here, car cannot have more gas in tank than the size of the tank"
        );
    }
    // Implement the addGas() method and handle the exception
    @Test
    public void testAddGas() {
        try {
            // Attempt to add gas to the car
            test_car.addGas(5);

            // If no exception is thrown, the test should fail with a custom message
            fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
        } catch (IllegalArgumentException e) {
            // If an exception is thrown, it's expected behavior
            // You can add additional assertions if needed
        }
    }
}