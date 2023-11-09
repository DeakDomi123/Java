package ZHgyak.FarkasFruzsi.ora3;

public class Main {
    public static void main(String[] args) {

        KozonsegesTort kozonsegesTort1 = new KozonsegesTort();
//        kozonsegesTort1.setNevezo(3);
//        kozonsegesTort1.setSzamlalo(5);
        System.out.println(kozonsegesTort1.tort());

        KozonsegesTort kozonsegesTort2 = new KozonsegesTort(5, 3);

        System.out.println(kozonsegesTort2.tort());

        KozonsegesTort kozonsegesTort3 = new KozonsegesTort(4);
        System.out.println(kozonsegesTort3.getSzamlalo() + "/" + kozonsegesTort3.getNevezo());
        System.out.println(kozonsegesTort3.toString());

        System.out.println(KozonsegesTort.getKozonsegesTortekSzama());

        System.out.println(kozonsegesTort1);
        System.out.println(kozonsegesTort2);
        System.out.println(kozonsegesTort3);

//        System.out.println(kozonsegesTort1.equals(kozonsegesTort1));
//        Scanner sc = new Scanner(System.in);
//        System.out.println(kozonsegesTort1.equals(sc));
//        System.out.println(kozonsegesTort1.equals(kozonsegesTort2));
//        KozonsegesTort k3 = new KozonsegesTort(4, 1);
//        System.out.println(kozonsegesTort3.equals(k3));

        kozonsegesTort2.reciprok();
        System.out.println(kozonsegesTort2);

        kozonsegesTort2.egeszetHozzaad(2);
        System.out.println(kozonsegesTort2);

        kozonsegesTort3.oszt(kozonsegesTort2);
        System.out.println(kozonsegesTort3);

        kozonsegesTort2.megszoroz(kozonsegesTort3);

        System.out.println(kozonsegesTort2);


//        System.out.println(Double.MAX_VALUE);

    }
}