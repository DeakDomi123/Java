import java.util.Scanner;
public class ora3v2 {

    public static void main(String[] args) {
        Emberek[] emberektomb = new Emberek[1];
        final Scanner be = new Scanner(System.in);
        for(int i = 0; i < emberektomb.length; i++){
            // vezetéknév
            System.out.println("Vezetéknév: ");
            String vezeteknev = be.nextLine();
            //keresztnév
            System.out.println("Keresztnév: ");
            String keresztnev = be.nextLine();
            //anyja neve
            System.out.println("Anyja neve: ");
            String anyjaneve = be.nextLine();
            //születési év
            System.out.println("Születési év: ");
            int szulev = be.nextInt();
            be.nextLine();
            //sz. ig
            System.out.println("Sz. ig: ");
            String szig = be.nextLine();
            emberektomb[i] = new Emberek(vezeteknev, keresztnev, anyjaneve, szulev, szig);
        }
        for(var a: emberektomb){
            System.out.println("Vezetéknév: " + a.getVezeteknev() + "\tKeresztnév: " + a.getKeresztnev() + "\tAnyja neve: (" + a.getAnyjaneve() + ")\tÉletkor: " + (a.getEletkor()) + "\tSz. ig: " + a.getSzig());
        }
        emberektomb[0].setVezeteknev("Kiss");
        emberektomb[0].setKeresztnev("Anci");
        for(var a: emberektomb){
            System.out.println("Vezetéknév: " + a.getVezeteknev() + "\tKeresztnév: " + a.getKeresztnev() + "\tAnyja neve: (" + a.getAnyjaneve() + ")\tÉletkor: " + (a.getEletkor()) + "\tSz. ig: " + a.getSzig());
        }
        System.out.println(emberektomb[0].toString());
    }
}
