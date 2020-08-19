package Misc.Tips.Imports.src;

import java.util.ArrayList;

import static java.lang.System.out; // imports only the sysout from the java lang
import static java.util.Collections.*; // imports all the static methods inside the collections

public class ImportsRunner {
    
    public static void main(String[] args) {
        
        out.println("Static imports");
        
        sort(new ArrayList<String>()); // Collections.sort();
    }
}