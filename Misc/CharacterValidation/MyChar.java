package Misc.CharacterValidation;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U')
            return true;

        return false;
    }

    public boolean isConsonant() {
        if (isVowel() == false && isDigit() == false)
            return true;
        return false;
    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57)
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if (isVowel() == true || isConsonant() == true)
            return true;
        return false;
    }

    public char printLowerCaseAlphabets() {
        if (isAlphabet() == true)
            ;
        return Character.toUpperCase(ch);
    }

    public char printUpperCaseAlphabets() {
        if (isAlphabet() == true)
            ;
        return Character.toLowerCase(ch);
    }
}