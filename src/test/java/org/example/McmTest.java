package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class McmTest {

    private  Mcm mcm;

    @BeforeEach
    public void setup() {
        mcm = new Mcm();
    }
    @Test
    public void whenReceiveTwoNumbers_thenCalculateMcmValue_test() {
        assertEquals(180, mcm.calculate(45, 60));
    }

    @Test
    public void whenTwoValueIsZero_thenReturnZero_test() {
        assertEquals(0, mcm.calculate(0, 0));
    }

    @Test
    public void whenAValueIsZero_thenReturnZero_test() {
        assertEquals(0, mcm.calculate(2, 0));
    }

}
