package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BitCountingTest {
    @Test
    public void testGame() {
        assertEquals(5,
                BitCounting.countBits(1234));
        assertEquals(8,
                BitCounting.countBits(255));
        assertEquals(3,
                BitCounting.countBits(7));
        assertEquals(2,
                BitCounting.countBits(9));
        assertEquals(2,
                BitCounting.countBits(10));
    }
}
