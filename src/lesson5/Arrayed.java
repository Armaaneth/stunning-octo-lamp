package lesson5;

public class Arrayed {
    public static void main(String[] args) {
        //Getting the class name of an array
        int[] ageArray = new int[9];
        ageArray[0] = 18;
        ageArray[1] = 16;
        ageArray[2] = 17;
        ageArray[3] = 18;
        ageArray[4] = 18;
        ageArray[5] = 18;
        ageArray[6] = 19;
        ageArray[7] = 18;
        ageArray[8] = 17;

        Class c=ageArray.getClass();
        String name=c.getName();
        System.out.println(name);

        String names[] = {"Blessing", "Emmanuel", "Xamorite", "Wisdom", "Munachi", "Tomiwa", "Kachi", "Ponmile", "Olamilekan"};
        Class namesProxyArray = names.getClass();
        String named = namesProxyArray.getName();
        System.out.println(named);


        //Copying from One array to another array in java
        char alphabets[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j'};

        char first5letters[] = new char[5];

        System.arraycopy(alphabets, 0, first5letters ,  0, 5);

        for (int i = 0; i < first5letters.length; i++){

            System.out.println(first5letters[i]);
        }

        //Cloning an array in java
        //SingleDimensional array
        int num[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        int numClone[] = num.clone();
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        //Multidimensional Array
        String[][] zombies = new String[4][];
        zombies[0] = new String[2];
        zombies[1] = new String[2];
        zombies[2] = new String[2];
        zombies[3] = new String[3];

        zombies[0][0] = "Normal";
        zombies[0][1] = "Pistol";
        zombies[1][0] = "Fast";
        zombies[1][1] = "Shotgun";
        zombies[2][0] = "Strong";
        zombies[2][1] = "Sniper";
        zombies[3][0] = "Amplified";
        zombies[3][1] = "SMG";
        zombies[3][2] = "FlameThrower";


        for (int i=0; i<zombies.length; i++){
            for (int j=0; j<zombies[i].length; j++){
                System.out.print(zombies[i][j]+" ");
            }
            System.out.println();//new line
        }

        String[][] zombiesClone = zombies.clone();
        for (int i=0; i<zombiesClone.length; i++){
            for (int j=0; j<zombiesClone[i].length; j++){
                System.out.print(zombiesClone[i][j]+" ");
            }
            System.out.println();//new line
        }

    }
}
