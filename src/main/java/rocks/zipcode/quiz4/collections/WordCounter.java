package rocks.zipcode.quiz4.collections;

import java.lang.reflect.Array;
import java.util.*;

public class WordCounter {
    private Map map;

    public WordCounter(String... strings) {
        
    }

    public Map<String, Integer> getWordCountMap() {

        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> strings = new ArrayList<>();
        for (String s: strings){
            if (!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                int count = map.get(s);
                map.put(s, count++);
            }
        }
        return map;
    }
}
