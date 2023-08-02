package Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.*;

public class Exceptions {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Exception handling in java
//        Try and Catch block synthax
//        try{
//
//        }catch (Exception e){
//
//        }

        /*
        public class MyClass {
            public static void main(String[] args) {
                try {
                    // Try to load the class "MyOtherClass" using the default classpath
                    Class.forName("MyOtherClass");
                } catch (ClassNotFoundException e) {
                    // If the class is not found, specify a different classpath and try again
                    String newClasspath = "/path/to/my/other/class";
                    try {
                        ClassLoader classLoader = MyClass.class.getClassLoader();
                        Class.forName("MyOtherClass", true, classLoader.loadClass(newClasspath));
                    } catch (ClassNotFoundException ex) {
                        // If the class is still not found, print an error message
                        System.err.println("Could not find class: " + ex.getMessage());
                    }
                }
            }
        }


1. Arithmetic Exception
        try{
            //code that may raise exception
            int data=100/0;

        }catch(ArithmeticException e){
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");

2. NullPointer Exception
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("Exception detected");
        }


3. NumberFormat Exception
        try{
            String name = "abc";
            System.out.println(Integer.parseInt(name));
        }catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Exception detected");
        }

 4. ArrayIndexOutOfBounds Exception
        try{
            int a[] = new int[4];
            a[10] = 50;
            System.out.println(a[10]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Array index out of bounds exception");
        }


5. Resolving the exception in the catch block


        int a = 50;
        int b = 0;

        try{
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught");
            b = 10;
            System.out.println(a / b);
        }

6. Throwing an exception in the catch block

        try{
            int a = 50 / 0;
            System.out.println(a);
        }catch (ArithmeticException e){
            int b = 50 / 0;
            System.out.println(b);
        }

7. Handling the error with a different class

        int a[] = new int[5];
        a[10]= 4;
        try{
            System.out.println(a[10]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error detected");
        }
8. Handling unchecked exception

        try
        {
            int arr[]= {1,3,5,7};
            System.out.println(arr[10]); //may throw exception
        }
        // handling the array exception
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");

9. Handling Checked Exceptions

        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
            BufferedReader br = new BufferedReader(new FileReader(pw.toString()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        // providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File saved successfully");
         */

    }
}