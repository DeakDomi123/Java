package alakzatok.beolvasok;

import alakzatok.Alakzat;
import alakzatok.Kor;

import static alakzatok.beolvasok.Beolvaso.scanner;

public class KorBeolvaso extends Beolvaso{
    @Override public Alakzat beolvas() {
        System.out.println("R: ");
        final int r = scanner.nextInt();
        scanner.nextLine();
        return new Kor(r);
    }
}
