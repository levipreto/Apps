package Misc.StringBreaker;

public class StringBreakRunner {
    
    public static void main(String[] args) {

        StringBreak stringOne = new StringBreak("This text is too long");

        System.out.println("The text is " + stringOne.stringLength() + " characters long");

        for(int i = 0 ; i < stringOne.stringLength() ; i++) {
            System.out.println(stringOne.charAt(i));
        }    
    }
}