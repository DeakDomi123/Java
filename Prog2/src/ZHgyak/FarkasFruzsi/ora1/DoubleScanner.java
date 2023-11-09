import java.util.Scanner;

public class DoubleScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] doubles = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Give a number");
            if (scanner.hasNextDouble()) {
                doubles[i] = scanner.nextDouble();
            }
            else {
                scanner.next();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(doubles[i]);
        }
	}
}
