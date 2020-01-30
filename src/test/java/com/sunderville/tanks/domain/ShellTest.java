package com.sunderville.tanks.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellTest {

    @Test
    @DisplayName("Shell mass calculation")
    void getShellVolume() {

        Tank tank = new Tank("10430",
                "6", "6", "6", "6", "6", "6",
                "6", "6", "", "", "", "",
                "6", "4", "", "2", "2",
                "Other1", "1", "Other2", "1");
        Shell shell = new Shell();
        double expected = 2.358;
        double actual = shell.getShellVolume(tank);
        assertEquals(expected, actual, 0.2, "when shell calculation is correct");
    }
}