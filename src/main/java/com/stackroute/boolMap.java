package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class boolMap {
    public Map<String, Boolean> compute(String[] inp) {
        Map<String, Boolean> out = new HashMap<>();
        for(String word: inp) {
            Boolean temp = out.getOrDefault(word, null);
            if(temp == null) {
                temp = false;
            }
            else {
                temp = true;
            }
            out.put(word, temp);
        }
        return out;
    }
}
