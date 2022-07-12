package org.example;

import static org.example.Main.func;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void TestFunc() {
        int[] myArray = {1, 2, 1, 5};
        int actual = func(myArray);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc2() {
        int[] myArray = {1, 1, 1, 1, 1, 1, 100};
        int actual = func(myArray);
        int expected = 100;
        assertEquals(expected,actual);
    }
}