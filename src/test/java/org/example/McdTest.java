package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class McdTest {

    private Mcd mcd;

    @BeforeEach
    public void setup() {
        mcd = new Mcd();
    }
    @Test
    public void whenTwoNumbers_thenCalculateMcdValue_test() {
        assertEquals(15, mcd.calculate(45, 60));
    }

    @Test
    public void whenValueIsZero_thenReturnTheOtherValue_test() {
        assertEquals(2, mcd.calculate(2, 0));
    }

}
