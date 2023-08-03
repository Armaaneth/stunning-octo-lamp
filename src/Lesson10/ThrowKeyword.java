package Lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKeyword {
    /*
    public static void validate(int age){
        if (age < 18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("Person is welcome to vote");
        }
    }
     */

    public static  void morph() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Onome Esiri\\IdeaProjects\\Rhythm-xenorite\\jtp.txt");
        BufferedReader fileInput = new BufferedReader(file);
    }
    public static void main(String[] args) {
//        validate(12);
        try
        {
            morph();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
