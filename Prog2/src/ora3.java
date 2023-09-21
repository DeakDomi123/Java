import java.util.Scanner;
public class ora3 {
    public static void main(String[] args) {
        String[] emberek = new String[2];
        final Scanner be = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            // vezetéknév
            System.out.println("Vezetéknév: ");
            String s = be.nextLine();
            //keresztnév
            System.out.println("Keresztnév: ");
            s+= ", " + be.nextLine();
            //anyja neve
            System.out.println("Anyja neve: ");
            s+= ", " + be.nextLine();
            //születési év
            System.out.println("Születési év: ");
            s+= "," + be.nextInt();
            //sz. ig
            System.out.println("Sz. ig: ");
            s+= ", " + be.nextLine();
            be.nextLine();
            emberek[i] = s;

        }
        for(var ember: emberek){
            String[] reszek = ember.split(",");
            System.out.println("Vezetéknév: " + reszek[0] + "\tKeresztnév: " + reszek[1] + "\tAnyja neve: (" + reszek[2] + ")\tÉletkor: " + (2023-Integer.parseInt(reszek[3])) + "\tSz. ig: " + reszek[4]);
        }
    }
}
