package alakzatok;

import alakzatok.beolvasok.Beolvaso;

public class Main {
    public static void main(String[] args) {
        Merheto merheto = beolvas();
        if(merheto != null){
            System.out.println("Terfogat: " + merheto.terfogat());
        }
        else{
            System.out.println("Nem megfelelo alakzat");
        }
        Alakzat alakzat = beolvas();
        if(alakzat != null){
            System.out.println("Felszin: " + alakzat.felszin());
            System.out.println("Dimenzio: " + alakzat.dimenzio());
        }
        else{
            System.out.println("Nem megfelelo alakzat");
        }
        Sikidom sikidom = (Sikidom) beolvas();
        if(sikidom != null){
            System.out.println("Kerulet: " + sikidom.kerulet());
            System.out.println("Terulet: " + sikidom.terulet());
            System.out.println("Dimenzio: " + sikidom.dimenzio());
        }
        else{
            System.out.println("Nem megfelelo alakzat");
        }
    }
    private static Alakzat beolvas(){
        return null;
    }
    private static Merheto beolvas(){
        return null;
    }
    private static Sikidom beolvas(){
        return null;
    }

    private static Alakzat beolvas(){
        final Beolvaso beolvaso = Beolvaso.getBeolvaso();
        if(beolvaso != null){
            return beolvaso.beolvas();
        }
        else{
            return null;
        }
    }
}
