package Lesson10;

public class MultiCatch {
    public static void main(String[] args) {
        //Multiple Try and Catch Blocks
//        try{
//            //code that may raise exception
//            int[] number = new int[2];
//            number[4] = 100/0;
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }catch (ArrayIndexOutOfBoundsException aerr){
//            System.out.println("Array index out of bounds detected");
//        }

        try{
            //code that may raise exception
            int[] number = new int[2];
            number[4] = 100/0;
        }catch (NullPointerException err){
            System.out.println(err);
        }catch (NumberFormatException nerr){
            System.out.println(nerr);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Main exception class detected");
        }

        try{
            //code that may raise exception
            int[] number = new int[2];
            number[4] = 100/0;
        }catch (NullPointerException err){
            System.out.println(err);
        }catch (NumberFormatException nerr){
            System.out.println(nerr);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Main exception class detected");
        }finally {
            System.out.println("Error wasn't handled");
        }

    }
}
