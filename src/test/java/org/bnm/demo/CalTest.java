package org.bnm.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalTest {
    Cal c = new Cal();

    @Test
    public void addTest() {
        assertEquals(100,c.add(5,5));
    }

    @Test
    public void subTest() {
        assertEquals(10,c.sub(15,5));
    }

    @Test
    public void mulTest() {
        assertEquals(25,c.mul(5,5));
    }

    @Test
    public void divTest() {
        assertEquals(1,c.div(100,100));
    }
}
