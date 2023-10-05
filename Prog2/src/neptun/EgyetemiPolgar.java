package neptun;

public abstract class EgyetemiPolgar extends emberekNeptun{
    protected String neptunKod;
    public EgyetemiPolgar(String nev, int szev, boolean nem, int jovedelem, String neptunKod) {
        super(nev, szev, nem, jovedelem);
        this.neptunKod = neptunKod;
    }
}
