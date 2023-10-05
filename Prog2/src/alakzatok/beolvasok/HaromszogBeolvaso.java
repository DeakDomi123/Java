package alakzatok.beolvasok;

import alakzatok.Alakzat;

public class HaromszogBeolvaso extends Beolvaso{
    @Override
    public Alakzat beolvas() {
        System.out.println("A: ");
        final int a = Beolvaso.scanner.nextInt();
        System.out.println("B: ");
        final int b = Beolvaso.scanner.nextInt();
        System.out.println("C: ");
        final int c = Beolvaso.scanner.nextInt();
        return null;
    }
}
