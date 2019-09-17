package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountStringTest {

    private CountString countString = new CountString();

    @org.junit.Test
    public void count() {
        Map<String, Integer> exp = new HashMap<>();
        String inp = "one one -one___two,,three,one @three*one?two";
        exp.put("one", 5);
        exp.put("two", 2);
        exp.put("three", 2);
        assertEquals(exp, countString.count(inp));
    }

    @Test
    public void count_emptyString() {
        Map<String, Integer> exp = new HashMap<>();
        String inp = new String();
        assertEquals(exp, countString.count(inp));
    }

    @Test
    public void countNotNull() {
        Map<String, Integer> exp = new HashMap<>();
        String inp = "one one -one___two,,three,one @three*one?two";
        exp.put("one", 5);
        exp.put("two", 2);
        exp.put("three", 2);
        assertNotNull(countString.count(inp));
    }
}