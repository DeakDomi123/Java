package ZHgyak.Tesztelos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Tesztelos {
    public static void main(String[] args) {
        /*System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
        System.out.printf("Total value: %8.2f\n", 123.4567);
        System.out.printf("Total value: %.1f\n", 342.2345);*/
        for (String arg : args) System.out.println(arg);

        Car kocsi = new Car(1);
        kocsi.start();
        kocsi.stop();
        kocsi.showInfo();

        Person szemely1 = new Person(1,"Lajos");
        Person szemely2 = new Person(1, "Lajos");
        System.out.println(szemely1.equals(szemely2));
        szemely1.greet();
        szemely1.showInfo();
        //Scanner scanner = new Scanner(System.in);
        //String szoveg = scanner.nextLine();
        Camera kamera = new Camera(1);
        System.out.println(kamera.getId());
        kamera.setId(45);
        System.out.println(kamera.getId());

        // Új HashMap létrehozása
        HashMap<String, Integer> telefonKonyv = new HashMap<>();

        // Kulcs-érték párok hozzáadása
        telefonKonyv.put("Alice", 123456789);
        telefonKonyv.put("Bob", 987654321);
        telefonKonyv.put("Charlie", 555555555);

        // Kulcs alapján érték keresése
        int telefonszam = telefonKonyv.get("Bob");
        System.out.println("Bob telefonszáma: " + telefonszam);

        // Kulcs-érték párok bejárása
        for (String nev : telefonKonyv.keySet()) {
            int szam = telefonKonyv.get(nev);
            System.out.println(nev + ": " + szam);
        }
        Termek termek1 = new Termek("kenyér", 800);
        Termek termek2 = new Termek("kakaó", 500);
        System.out.println(termek1.compareTo(termek2));

        Robot robot = new Robot(8);
        robot.start();
        Robot.Battery battery = new Robot.Battery();
        battery.charge();

        List<String> lista = new ArrayList<String>();
        lista.add("tiger");
        lista.add("cica");
        lista.add("lion");
        lista.add("dog");
        //Collections.sort(lista, new StringLenghtComparator());
        Collections.sort(lista, new AlphabeticalComparator());
        System.out.println(lista);

        List<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(2);
        lista2.add(10);
        lista2.add(50);
        lista2.add(5);
        lista2.add(9);
        Collections.sort(lista2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(lista2);

        List<Person> emberek = new ArrayList<Person>();
        emberek.add(new Person(1,"Lajos"));
        emberek.add(new Person(2,"Joe"));
        emberek.add(new Person(4,"Imre"));
        emberek.add(new Person(2,"Martin"));

        Collections.sort(emberek, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                }
                return 0;
            }
        });
        for(Person ember: emberek){
            System.out.println(ember.getName() + " " + ember.getId());
        }
        /*try {
            FileReader fr = new FileReader("asd.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        /*try{
            test.run();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }*/
    }
    /*public void run() throws IOException, ParseException{
        throw new ParseException("Error in command list, ",2);
    }*/
    public static class Termek implements Comparable<Termek> {
        private String nev;
        private int ar;

        public Termek(String nev, int ar) {
            this.nev = nev;
            this.ar = ar;
        }

        @Override
        public int compareTo(Termek masikTermek) {
            // Ár alapján összehasonlítás
            return this.ar - masikTermek.ar;
        }

        public String toString() {
            return nev + " - " + ar + " Ft";
        }
    }
}

class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        if(len1 > len2){
            return 1;
        }
        else if(len1 < len2){
            return -1;
        }
        return 0;
    }

}