package ZHgyak.FarkasFruzsi.ora4.sokszogekOnallo;

public class Runner {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(2, 5);
        System.out.println(t1);
        System.out.println(t1.kerulet());
        System.out.println(t1.terulet());

        Nagyzet n1 = new Nagyzet(3);
        System.out.println(n1);
    }
}
