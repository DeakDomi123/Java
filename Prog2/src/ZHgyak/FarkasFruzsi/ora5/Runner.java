import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {


        Wind w1 = new Wind("east", 10);
        System.out.println(w1);
        Move m1 = new Wind("west", 3);
        System.out.println(m1);
//        ((Wind) m1).getDirection();

        Lorry l1 = new Lorry(4, 1000, 30, 57765, 4573567);
        System.out.println(l1);
        MeansOfTransport meansOfTransport1 = new Lorry(4, 1200, 30, 57765, 4573567);
//        meansOfTransport1.getCarryingCapacityInKg();
//        meansOfTransport1.getSpeedInMeterPerSec();
        Lorry l2 = (Lorry) meansOfTransport1;

        Frog f1 = new Frog(254, 1);
        System.out.println(f1.getNumberOfLegs());
        System.out.println(f1);

        Snake s1 = new Snake(12, 125324, "patterned");
        System.out.println(s1);
        Animal a1 = new Snake(234,125,"green");
        System.out.println(a1.getNumberOfLegs());
        System.out.println(((Snake) a1).getSnakeType());

        Ostrich o1 = new Ostrich(1234, 2435, 456, "strucc", "foltos", LocalDate.now());
        Ostrich o2 = new Ostrich(1234, 2435, 456, "strucc", "foltos", LocalDate.of(2009, 3, 16));
        System.out.println(o1);
        System.out.println(o2);

        Horse h1 = new Horse(40, 100, 200, "alma", "barna", LocalDate.now());
        System.out.println(h1);
        Horse h2 = new Horse(40, 100, 200, "korte", "barna", LocalDate.now());
        Horse h3 = new Horse(40, 100, 100, "banan", "barna", LocalDate.now());
        Horse h4 = new Horse(40, 100, 700, "dio", "barna", LocalDate.now());

        Horse[] horseArray = {h1, h2, h3, h4};

        Arrays.sort(horseArray);

        for (Horse horse : horseArray) {
            System.out.println(horse);
        }

        ArrayList<Horse> arrayList = new ArrayList<>();
        arrayList.add(h1);
        arrayList.add(h2);
        arrayList.add(h3);
        arrayList.add(h4);

        Collections.sort(arrayList);

        System.out.println("-----");
        for (Horse horse : arrayList) {
            System.out.println(horse);
        }


    }
}