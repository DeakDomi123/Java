import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ora2 {
    public static void main(String[] args) {
        int[] tomb = new int[10];
        tomb[0] = 5;
        Random rand = new Random();
        /*Arrays.fill(tomb, rand.nextInt(20));
        Arrays.fill(tomb, 5,7, rand.nextInt(10));*/
        for(int i = 0; i < tomb.length; i++) {
            tomb[i] = rand.nextInt(20);
            System.out.print(tomb[i] + "\t");
        }
        //System.out.println(Arrays.toString(tomb));
        System.out.println();
        for(int i = 0; i < tomb.length; i++){
            for(int j  = i+1; j < tomb.length; j++){
                if(tomb[i] > tomb[j]){
                    int temp = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = temp;
                }
            }
        }
        for (int j : tomb) {
            System.out.print(j + "\t");
        }
        Arrays.sort(tomb);
        System.out.println();
        //System.out.println("Melyik számot keresed? ");
        //Scanner be = new Scanner(System.in);
        //int szam = be.nextInt();
        //System.out.println(Arrays.binarySearch(tomb, szam)==-1?"Nincs benne":"Benne van");

        System.out.println("\n");
        int[][] matrix = new int[5][5];
        final int sor = 5;
        final int oszlop = 5;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++) {
                if(i>=j){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }
}