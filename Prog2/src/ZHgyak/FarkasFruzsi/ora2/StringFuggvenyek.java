import java.util.Scanner;

public class StringFuggvenyek {

    public static void main(String[] args) {

        System.out.println("Adjon meg egy stringet");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s);
        System.out.println(s.equals("alma"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(0));

        //abc összehasonlításra
        System.out.println(s.compareTo("alma"));
        System.out.println(s.contains("ma"));
        s = s + ";";
        System.out.println(s);
    }
}
