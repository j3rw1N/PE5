package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    public Map<String, Integer> count(String inp) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for(String word: inp.split("[ \\-,@*?_]")) {
            if(word.isEmpty()|| word.equals(" ")) {
                continue;
            }
            int temp = hashMap.getOrDefault(word, 0);
            temp++;
            hashMap.put(word,temp);
        }
        return hashMap;
    }
}
