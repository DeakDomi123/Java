package neptun;

import java.util.Arrays;

public class Hallgato extends emberekNeptun{
    public static final int DARAB = 10;
    private String neptunKod;
    private String szak;
    private int evfolyam;
    private int targyakSzama;
    private Tantargy[] tantargyak = new Tantargy[DARAB];

    public Hallgato(String nev, int szev, boolean nem, int jovedelem, String neptunKod, String szak, int evfolyam) {
        super(nev, szev, nem, jovedelem);
        this.neptunKod = neptunKod;
        this.szak = szak;
        this.evfolyam = evfolyam;
        this.targyakSzama=0;
        this.tantargyak = new Tantargy[DARAB];
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public String getSzak() {
        return szak;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public int getTargyakSzama() {
        return targyakSzama;
    }

    public Tantargy[] getTantargyak() {
        return tantargyak;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public void setSzak(String szak) {
        this.szak = szak;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }

    public void setTargyakSzama(int targyakSzama) {
        this.targyakSzama = targyakSzama;
    }

    public void setTantargyak(Tantargy[] tantargyak) {
        this.tantargyak = tantargyak;
    }

    @Override
    public String toString() {
        StringBuilder szoveg = new StringBuilder();
        szoveg.append(super.toString());
        szoveg.append( "Hallgato{" +
                "neptunKod='" + neptunKod + '\'' +
                ", szak='" + szak + '\'' +
                ", evfolyam=" + evfolyam +
                ", targyakSzama=" + targyakSzama);
        szoveg.append("Tantárgyak:\n");
        for(int i = 0; i < this.targyakSzama; i++){
            szoveg.append(this.tantargyak[i].toString()+"\n");
        }
        for(Tantargy t:tantargyak){
            szoveg.append(t==null?"":t.toString()+"\n");
        }
        return szoveg.toString();
    }
}
