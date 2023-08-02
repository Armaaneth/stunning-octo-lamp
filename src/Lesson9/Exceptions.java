package Lesson9;

public class Exceptions {
    public static void main(String[] args) {
        /*
        Arithmetic
        NullPointer
        IndexOutOfBounds
        NumberFormat


1.         Arithmetic Exception
        int a = 50;
        int b = 0;

        try{
            System.out.println(a / b);
        }catch(Exception err){
            System.out.println(err);
            System.out.println("Arithmetic bug detected");
        }


        int a = 50;
        int b = 0;

        try{
            System.out.println(a / b);
        }catch(ArithmeticException err){
            System.out.println(err);
            System.out.println("Arithmetic bug detected");
        }

2.      NullPointer Exception


        String name = null;
//        int four = Integer.parseInt(null);
        //System.out.println(name.length()); //   returns an error

        try{
            System.out.println(name.length());
        }catch(NullPointerException err){
            System.out.println(err);
            System.out.println("Null Pointer Exception detected");
        }

3.      Number format Exception

        int five;
        try{
            five = Integer.parseInt(null);
        }catch (NumberFormatException err){
            System.out.println("Number format exception detected");
        }

4.      Indexoutofbounds Exception
=====>  ArrayIndexOutOfBounds Exception
=====>  StringIndexOutOfBounds Exception


        int[] numbers = new int[10];

        try{
            numbers[0] = 10;
            numbers[2] = 38;
            numbers[11]= 20;
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("ArrayIndexOutOfBoundsException detected");
        }


        String title = new String("Manna");

        try{
            System.out.println(title.charAt(8));
        }catch(StringIndexOutOfBoundsException err){
            System.out.println("String index out of bounds exception");
        }

         */
//        Handling Exceptions
//        Arithmetic Exception
        /*
        int a = 50;
        int b = 0;

        try{
            System.out.println(a / b);
        }catch(ArithmeticException err){
            b = 10;
            System.out.println(a / b);
            System.out.println(err);

        }
2. Null Pointer Exception

        String name = null;

        try{
            System.out.println(name.length());
        }catch(NullPointerException err){
            name = "Tomiwa Elegushi";
            System.out.println(name.length());
            System.out.println(err);
            System.out.println("Null Pointer Exception detected");
        }

3. NumberFormat Exception

        int five;
        try{
            five = Integer.parseInt(null);
        }catch (NumberFormatException err){
            five = 10;
            System.out.println(five);
            System.out.println("Number format exception detected");
        }

4.  IndexOutOfBounds Exception

        int[] numbers = new int[10];

        try{
            numbers[0] = 10;
            numbers[2] = 38;
            numbers[11]= 20;
        }catch(ArrayIndexOutOfBoundsException err){
            numbers[9] = 20;
            System.out.println(numbers[9]);
            System.out.println("ArrayIndexOutOfBoundsException detected");
        }
         */

        String title = new String("Manna");

        try{
            System.out.println(title.charAt(8));
        }catch(StringIndexOutOfBoundsException err){
//            title = "My Manna fell from heaven";
//            System.out.println(title.charAt(9));
            System.out.println(title.charAt(2));
            System.out.println("String index out of bounds exception");
        }

    }
}
