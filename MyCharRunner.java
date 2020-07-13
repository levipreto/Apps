public class MyCharRunner {

    public static void main(String[] args) {
        MyChar myChar = new MyChar('1');
        System.out.println("Vowel " + myChar.isVowel());
        System.out.println("Consonant " + myChar.isConsonant());
        System.out.println("Digit " + myChar.isDigit());
        System.out.println("Is alphabet " + myChar.isAlphabet());
        System.out.println("The lower case " + myChar.printLowerCaseAlphabets());
        System.out.println("The upper case " + myChar.printUpperCaseAlphabets());
    }
}