package com.stackroute;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModTest {

    private MapMod map = new MapMod();

    @Test
    public void swap() {
        Map<String, String> inp = new HashMap<>();
        inp.put("val1", "java");
        inp.put("val2", "c++");

        Map<String, String> exp = new HashMap<>();
        exp.put("val1", " ");
        exp.put("val2", "java");

        assertEquals(exp, map.swap(inp));
    }

    @Test
    public void swap_val1Null_returnInpWithoutMod() {
        Map<String, String> inp = new HashMap<>();
        inp.put("val2", "c++");

        Map<String, String> exp = new HashMap<>();
        exp.put("val2", "c++");
        assertEquals(exp, map.swap(inp));
    }

    @Test
    public void swapNotNull() {
        Map<String, String> inp = new HashMap<>();
        inp.put("val1", "");
        inp.put("val2", "c++");

        assertNotNull(map.swap(inp));
    }
}