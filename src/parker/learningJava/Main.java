package parker.learningJava;

public class Main {

    public static void main(String[] args) {
        //only stores one character
        //last key press, single digit in a menu option
        //char occupies 2 bytes of memory
        //unicode is an international encoding standard for use with different languages and scripts by which each letter digit,or symbols
	char myChar = 'C';
    char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

    }
}
