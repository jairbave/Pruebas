package com.example.tarea1;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    @Test
    public void TestMiltiplicacion() {

        assertEquals(9, 5 * 3);
    }

    @Test
    public void TestSuma() {

        assertEquals(9, 3 - 3);
    }

    @Test
    public void TestResta() {

        assertEquals(-1, 3 - 4);
    }

    @Test
    public void Divicion() {

        assertEquals(4, 3 / 3);
    }
}