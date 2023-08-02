package Lesson8;

public class immutableStrings {
    public static void main(String[] args) {
//        String utensil = "Duster";
//        utensil = "Microwave";
//        System.out.println(utensil);
//
//        String s = new String("Food");
//        String s =  new String("Veyr");

//        String s1 = "David";
//        String s2 = "Tobi";
//        String s3 = "Diekola";
//        String s4 = "david";


//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
//        System.out.println(s1.equalsIgnoreCase(s4));

        String s1="Sachin";
        String s2="Sachin";
        String s3="Ratan";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
