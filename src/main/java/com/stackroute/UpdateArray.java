package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateArray {
    private List<String> array = new ArrayList<String>();
    public void setArray(String[] inp) {
        array = Arrays.asList(inp);
    }
    public String[] getArray() {
        String[] out = new String[this.array.size()];
        this.array.toArray(out);
        return out;
    }
    public boolean updateArray(String newString, String old) {
        int pos = array.indexOf(old);
        if(pos == -1) {
            return false;
        }
        array.set(pos, newString);
        return true;
    }

    public List<String> removeAll() {
        array.clear();
        return array;
    }
}
