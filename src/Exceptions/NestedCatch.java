package Exceptions;

public class NestedCatch {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        try{
            numbers[11] = 10;
        }catch (ArithmeticException aerr){
            System.out.println("Arithmetic exception detected");
        }catch (NullPointerException nerr){
            System.out.println("Null pointer exception detected");
        }catch (ArrayIndexOutOfBoundsException arrErr){
            System.out.println("Array index out of bounds exception");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Exception detected");
        }
    }
}
