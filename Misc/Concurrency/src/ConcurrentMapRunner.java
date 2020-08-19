package Misc.Concurrency.src;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    
    public static void main(String[] args) {
        
        ConcurrentMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();
        
        String str = "ABCD ABCD ABCD";
        for (char character : str.toCharArray()) {
            occurences.computeIfAbsent(character, ch -> new LongAdder()).increment();
        }

        System.out.println(occurences);
    }
}