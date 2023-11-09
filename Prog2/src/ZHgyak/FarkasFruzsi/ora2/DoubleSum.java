import java.util.Arrays;
import java.util.Scanner;

public class DoubleSum {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        double[] tomb = new double[3];

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < 3; i++) {
            tomb[i] = sc.nextDouble();

            if (min > tomb[i]) {
                min = tomb[i];
            }

            if (max < tomb[i]) {
                max = tomb[i];
            }

//            sum = sum + tomb[i];
            sum += tomb[i];
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);

        Arrays.sort(tomb);
        for (int i = 0; i < 3; i++) {
            System.out.println(tomb[i]);
        }
    }
}
