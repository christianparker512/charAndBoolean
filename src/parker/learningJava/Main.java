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
    boolean myTrueBooleanValue = true;
    boolean myFalseBooleanValue = false;
    boolean isCustomerOverTwentyOne = true;

    //byte
    //short
    //long
    //float
    //double
    //char
    //boolean
       String myString = "My name is chris";
        System.out.println("My string is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
    }
}
