package lesson6;

import java.util.Arrays;

//Strings in Java
 class Table{
    public void add(){

    }

}
public class Strings {

    public static void main(String[] args) {
        int ten = 10;
        String name = "Ayo"; //Using String Literal


        char film[] = {'O', 'p', 'p', 'e', 'n','h','e','i','m','e','r' };
        String filmName = new String(film);

//        System.out.println(name);
//        System.out.println(fruits);
//        System.out.println(filmName);

        //Using String Class Methods
        String fruits = new String("Watermelon");
//        No.	Method	Description
//        1	char charAt(int index)	It returns char value for the particular index
        System.out.println(fruits.charAt(2));

//        2	int length()	It returns string length
        System.out.println(fruits.length());
//        3	static String format(String format, Object... args)	It returns a formatted string.
//        String formattedString = String.format(fruits, 42);
//        4	static String format(Locale l, String format, Object... args)	It returns formatted string with given locale.
//        5	String substring(int beginIndex)	It returns substring for given begin index.
        String subStr = fruits.substring(3);
        System.out.println(subStr);
//        6	String substring(int beginIndex, int endIndex)	It returns substring for given begin index and end index.
        String subfruits = fruits.substring(0, 5);
        System.out.println(subfruits);
//        7	boolean contains(CharSequence s)	It returns true or false after matching the sequence of char value.
        Boolean isContains = fruits.contains("ater");
        System.out.println(isContains);
//        8	static String join(CharSequence delimiter, CharSequence... elements)	It returns a joined string.
        String fruitDrink = fruits.join(":", "Chapman", "Smoothie", "Cocktail" );
        System.out.println(fruitDrink);
        System.out.println(fruits);
//        9	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)	It returns a joined string.
        String str = String.join(", ", Arrays.asList("apple", "banana", "cherry"));
        System.out.println(str); // prints apple, banana, cherry
//        10	boolean equals(Object another)	It checks the equality of string with the given object.
        Boolean isequals = fruits.equals(filmName);
        System.out.println(isequals);
//        11	boolean isEmpty()	It checks if string is empty.
        Boolean isEmpty = fruits.isEmpty();
        System.out.println(isEmpty);
//        12	String concat(String str)	It concatenates the specified string.
//        13	String replace(char old, char new)	It replaces all occurrences of the specified char value.
//        14	String replace(CharSequence old, CharSequence new)	It replaces all occurrences of the specified CharSequence.
//        15	static String equalsIgnoreCase(String another)	It compares another string. It doesn't check case.
//        16	String[] split(String regex)	It returns a split string matching regex.
//        17	String[] split(String regex, int limit)	It returns a split string matching regex and limit.
//        18	String intern()	It returns an interned string.
//        19	int indexOf(int ch)	It returns the specified char value index.
//        20	int indexOf(int ch, int fromIndex)	It returns the specified char value index starting with given index.
//        21	int indexOf(String substring)	It returns the specified substring index.
//        22	int indexOf(String substring, int fromIndex)	It returns the specified substring index starting with given index.
//        23	String toLowerCase()	It returns a string in lowercase.
//        24	String toLowerCase(Locale l)	It returns a string in lowercase using specified locale.
//        25	String toUpperCase()	It returns a string in uppercase.
//        26	String toUpperCase(Locale l)	It returns a string in uppercase using specified locale.
//        27	String trim()	It removes beginning and ending spaces of this string.
//        28	static String valueOf(int value)	It converts given type into string. It is an overloaded method.

    }
}
