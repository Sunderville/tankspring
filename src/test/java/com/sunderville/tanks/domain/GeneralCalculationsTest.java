package com.sunderville.tanks.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneralCalculationsTest {

    private Tank tank;

    @BeforeEach
    void setUp() {
        tank = new Tank("10430",
                "6", "6", "6", "6", "6", "6",
                "6", "6", "", "", "", "",
                "6", "4", "", "2", "2",
                "Other1", "1", "Other2", "1");
    }

    @Test
    void resultMass() {
        GeneralCalculations generalCalculations = new GeneralCalculations();
        double expected = 36.59;
        double actual = generalCalculations.resultMass(tank, "09Г2С");
        assertEquals(expected, actual, 0.3, "when resultMass method is correct");
    }

    @Test
    void resultPrice() {
        GeneralCalculations generalCalculations = new GeneralCalculations();
        double expected = 3110.15;
        double actual = generalCalculations.resultPrice(tank, "09Г2С", "85");
        assertEquals(expected, actual, 10.0, () -> "Here should be " + expected + " but it is actually " + actual);
    }



}