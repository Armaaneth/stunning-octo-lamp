package lesson4;

public class TwodArray {
    /*
    *
    *   dataType[][] arrayRefVar; (or)
    *   Int[][] integer;
        dataType [][]arrayRefVar; (or)
        * Int [][]integer;
        dataType arrayRefVar[][]; (or)
        * int integer[][];
        dataType []arrayRefVar[];
        * int []integer[];
     */
    public static void main(String[] args) {
        int[][] intArray  = new int[3][3];
        intArray[0][0] = 1;
        intArray[0][1] = 2;
        intArray[0][2] = 3;
        intArray[1][0] = 4;
        intArray[1][1] = 5;
        intArray[1][2] = 6;
        intArray[2][0] = 7;
        intArray[2][1] = 8;
        intArray[2][2] = 9;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }

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
    }
}
