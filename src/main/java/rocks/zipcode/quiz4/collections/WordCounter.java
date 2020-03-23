package rocks.zipcode.quiz4.collections;

import java.lang.reflect.Array;
import java.util.*;

public class WordCounter {
//    private Map map;
    Map<String, Integer> map = new HashMap<>();
    public WordCounter(String... strings) {
        for (String s: strings){
            if (!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                int count = map.get(s);
                map.put(s, map.get(s) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return map;
    }
}
