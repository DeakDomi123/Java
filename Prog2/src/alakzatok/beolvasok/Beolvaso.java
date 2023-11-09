package alakzatok.beolvasok;

import alakzatok.Alakzat;

import java.util.Scanner;

public abstract class Beolvaso {
    protected static Scanner scanner = new Scanner(System.in);

    public abstract Alakzat beolvas();
    public static Beolvaso getBeolvaso(){
        final String tipus = scanner.nextLine();
        if ("KOR".equals(tipus)) {
            return new KorBeolvaso();
        }
        else if("NEGYZET".equals(tipus)){
            return new NegyzetBeolvaso();
        }
        else if("HAROMSZOH".equals(tipus)){
            return new HaromszogBeolvaso();
        }
        else{
            return null;
        }
    }
}
