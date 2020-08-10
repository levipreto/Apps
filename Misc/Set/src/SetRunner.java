package Misc.Set.src;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class SetRunner {

    public static void main(String[] args) {
        
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

        Set<Character> treeSet = new TreeSet<>(characters); // insertion order
        System.out.println("Tree Set: " + treeSet);

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters); // sorted order
        System.out.println("Linked Hash Set: " + linkedHashSet);

        Set<Character> HashSet = new HashSet<>(characters); // most efficient, cannot rely on it being sorted
        System.out.println("Hash Set: " + HashSet);
    }

}