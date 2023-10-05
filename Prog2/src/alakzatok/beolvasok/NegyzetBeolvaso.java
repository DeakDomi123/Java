package alakzatok.beolvasok;

import alakzatok.Alakzat;
import alakzatok.Negyzet;

public class NegyzetBeolvaso extends Beolvaso{
    @Override
    public Alakzat beolvas() {
        System.out.println("A: ");
        final int a = Beolvaso.scanner.nextInt();
        scanner.nextLine();
        return new Negyzet(a);
    }
}
