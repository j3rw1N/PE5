package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class boolMapTest {

    private boolMap test = new boolMap();

    @Test
    public void compute() {
        String[] inp = {"a","b", "c","d","a","c","c"};
        Map<String, Boolean> exp = new HashMap<>();
        exp.put("a", true);
        exp.put("b", false);
        exp.put("c", true);
        exp.put("d", false);
        assertEquals(exp, test.compute(inp));
    }

    @Test
    public void computeNotNull() {
        String[] inp = {"a"};
        assertNotNull(test.compute((inp)));
    }
    
    @Test
    public void computEmptyArray() {
        String[] inp = new String[0];
        Map<String, Boolean> exp = new HashMap<>();
        assertEquals(exp, test.compute(inp));
    }
}