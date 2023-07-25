package lesson4;

public class Array {
        //creating a method which receives an array as a parameter
        static void min(int arr[]) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++)
                if (min > arr[i])
                    min = arr[i];

            System.out.println(min);
        }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    static void printNames(String namesArray[]){
            for (String i: namesArray)
                System.out.println(i);
    }

    //    Synthax of a single dimensional array
//    dataType[] arr; (or)
//    dataType []arr; (or)
//    dataType arr[];
    public static void main(String[] args) {
        printNames(new String[]{"Bolu", "Bola", "Wisdom", "Blessing", "Faithfulness"});

        printArray( new int[]{2, 3, 4, 5, 6});

        int a[]={33,3,4,5};
        min(a);



        //Integer Array
//        int a[] = new int[5];

//        a[0] = 10;//initialization
//        a[1] = 20;
//        a[2] = 70;
//        a[3] = 40;
//        a[4] = 50;
//        //traversing array
//        for (int i = 0; i < a.length; i++)//length is the property of array
//            System.out.println(a[i]);

        /*
        int num[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        String names[] = {"Wisdom", "Knowledge", "Fortitude", "Tomita", "Blessing"};
        for (String i:names){
            System.out.println(i);
        }
        */


        //Classwork: Pass an array to a method
    }
}

