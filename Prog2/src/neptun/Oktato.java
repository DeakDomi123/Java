package neptun;

public class Oktato extends EgyetemiPolgar implements Alkalmazott{
    public Oktato(String nev, int szev, boolean nem, int jovedelem, String neptunKod) {
        super(nev, szev, nem, jovedelem, neptunKod);
    }

        @Override
        public int fizetes() {
            return 0;
        }

}
