import java.util.Scanner;

public class ReadInWithScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give an integer");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
        }
        else {
            System.out.println("That wasn't an integer");
        }
    }
}
