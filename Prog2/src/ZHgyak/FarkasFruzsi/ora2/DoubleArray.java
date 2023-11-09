import java.util.Scanner;

public class DoubleArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] dtomb = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print("[" + (i+1) + ", " + (j+1) + "]: ");
                dtomb[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(dtomb[i][j]);
            }
        }

        double determinans = (dtomb[0][0] * dtomb[1][1]) - (dtomb[0][1] * dtomb[1][0]);
        System.out.println("Determinans " + determinans);
    }
}
