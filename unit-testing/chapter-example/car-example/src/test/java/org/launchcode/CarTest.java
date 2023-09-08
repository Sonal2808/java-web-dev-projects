package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
Car test_car;

    @Test
    public void emptyTest(){
    assertEquals(10,10,0.001);
}
    @ BeforeEach
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testInitialGasTank(){
    assertEquals(10,test_car.getGasTankLevel(),1);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}