import java.util.Scanner;

public class DoubleTomb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Please give 3 double separated by ; for a triangle");

            String s = sc.nextLine();
//        if (s.matches("[0-9;+]")) {
//            System.out.println("nem jó");
//        }
//        tomb[1] = Double.parseDouble(s);

            String[] strings = new String[3];
            strings = s.split(";");

//        for (int i = 0; i < 3; i++) {
//            System.out.println(strings[i]);
//        }

            double a = Double.parseDouble(strings[0]);
            double b = Double.parseDouble(strings[1]);
            double c = Double.parseDouble(strings[2]);

            double valtozo = Double.MIN_VALUE;
//            int j = Integer.MAX_VALUE


            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("negativ oldal, nem letezik a haromszog");
                continue;
            }

            if ((a + b > c) && (a + c > b) && (c + b > a)) {
                System.out.println("letezik");
            }
            else {
                System.out.println("nem letezik");
                continue;
            }

            if (a < b) {
                double d = a;
                a = b;
                b = d;
            }

            if (a < c) {
                double d = a;
                a = c;
                c = d;
            }

            System.out.println("a haromszog: " + a + " " + b + " " + c);

            if (a*a < (b*b + c*c)) {
                System.out.println("hegyes");
            }
            else if (a*a == (b*b + c*c)) {
                System.out.println("derek");
            }
            else {
                System.out.println("tompa");
            }

        }

//        sc.close();
    }
}















