package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SetSortTest {

    private SetSort setSort = new SetSort();

    @Test
    public void getArrayList() {
        setSort.add("Harry");
        setSort.add("Olive");
        setSort.add("Alice");
        setSort.add("Bluto");
        setSort.add("Eugene");

        List<String> exp = new ArrayList<>();
        exp.add("Alice");
        exp.add("Bluto");
        exp.add("Eugene");
        exp.add("Harry");
        exp.add("Olive");

        assertEquals(exp, setSort.getArrayList());

        setSort.clear();
    }

    @Test
    public void getArrayListNotNull() {
        setSort.add("Harry");
        setSort.add("Olive");
        setSort.add("Alice");
        setSort.add("Bluto");
        setSort.add("Eugene");

        assertNotNull(setSort.getArrayList());

        setSort.clear();
    }

    @Test
    public void getArrayList_Duplicates_removesDuplicates() {
        setSort.add("Harry");
        setSort.add("Harry");
        setSort.add("Olive");
        setSort.add("Alice");
        setSort.add("Bluto");
        setSort.add("Eugene");
        setSort.add("Harry");

        List<String> exp = new ArrayList<>();
        exp.add("Alice");
        exp.add("Bluto");
        exp.add("Eugene");
        exp.add("Harry");
        exp.add("Olive");

        assertEquals(exp, setSort.getArrayList());
    }
}