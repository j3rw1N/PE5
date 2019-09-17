package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayTest {

    private UpdateArray updateArray = new UpdateArray();

    @Test
    public void getArray() {
        String[] inp = new String[]{"Apple","Grape","Melon","Berry"};
        updateArray.setArray(inp);
        assertArrayEquals(inp, updateArray.getArray());
    }

    @Test
    public void updateArray() {
        String[] inp = new String[]{"Apple","Grape","Melon","Berry"};
        updateArray.setArray(inp);
        updateArray.updateArray("Kiwi", "Apple");
        updateArray.updateArray("Mango","Melon");
        String[] exp = new String[]{"Kiwi","Grape","Mango","Berry"};
        assertArrayEquals(exp, updateArray.getArray());
    }

    @Test
    public void removeAll() {
        List<String> exp = new ArrayList<String>();
        assertEquals(exp, updateArray.removeAll());
    }
}