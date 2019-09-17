package com.stackroute;

import java.util.Map;

public class MapMod {
    public Map<String, String> swap(Map<String, String> inp) {
        String val1 = inp.getOrDefault("val1", null);
        if(val1 == null || val1.isEmpty()) {
            return inp;
        }
        inp.put("val2", val1);
        inp.put("val1", " ");
        return inp;
    }
}
