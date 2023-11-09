import java.util.Scanner;

public class InfiniteReader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("Give a string");
            String s = sc.next();
            System.out.println("Your string was: " + s);
            if (s.equals("exit")) {
                break;
            }
        }
        sc.close();
    }
}
