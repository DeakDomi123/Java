package neptun;

public class Neptun {
    public static void main(String[] args) {
        emberekNeptun alfonz = new emberekNeptun();
        System.out.println(alfonz);
        alfonz.setJovedelem(2000);
        System.out.println(alfonz);
        Hallgato fred = new Hallgato("Piszkos Fred", 2000, false, 2000, "ABC123", "Programtervező informatikus", 2);
        System.out.println(fred);
    }
}
