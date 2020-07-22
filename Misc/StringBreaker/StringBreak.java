package Misc.StringBreaker;

public class StringBreak {
    
    private String someString;

    StringBreak(String someString) {
        this.someString = someString;
    }

	public int stringLength() {
        return someString.length();
	}

	public char charAt(int i) {
		return someString.charAt(i);
	}
}