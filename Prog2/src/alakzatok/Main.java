package alakzatok;

import alakzatok.beolvasok.Beolvaso;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Alakzat> lista = new LinkedList<>();
        System.out.println("Mit olvasunk be?");
        System.out.println("NEGYZET | HAROMSZOG");
        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"x".equals(input)){
            Merheto merheto = beolvas();
            if(merheto!=null){
                System.out.println(merheto.terfogat());
            }
            input = scanner.nextLine();
        }
        /*for(int i = 0; i < lista.size(); i++) {
            System.out.println((lista.get(i)).terfogat());
        }*/
        Collections.sort(lista);
        for (var merheto : lista) {
            System.out.println(merheto.felszin());
        }
        lista.sort(new FelszinComparator());
        for (var merheto : lista) {
            System.out.println(merheto.felszin());
        }

        //lista.clear();
        Merheto merheto = beolvas();
        if (merheto != null) {
            System.out.println(merheto.terfogat());
        }
        Alakzat alakzat = beolvas();
        if (alakzat != null) {
            System.out.println(alakzat.terfogat());
            System.out.println(alakzat.felszin());
        }
        Sikidom sikidom = (Sikidom)beolvas();
        if (sikidom != null) {
            System.out.println(sikidom.kerulet());
            System.out.println(sikidom.terulet());
        }
    }

    private static Alakzat beolvas() {
        final Beolvaso beolvaso = Beolvaso.getBeolvaso();
        if (beolvaso != null) {
            return beolvaso.beolvas();
        } else {
            return null;
        }

    }
}
class FelszinComparator implements Comparator<Alakzat> {
    @Override
    public int compare(Alakzat o1, Alakzat o2) {
        if(o1 == null && o2 == null)
            return 0;
        else if(o1==null && o2!=null)
            return -1;
        else if(o1!=null && o2==null)
            return 1;
        else
            return Double.compare(o1.felszin(), o2.felszin());
    }
}
