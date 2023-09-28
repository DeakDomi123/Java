package neptun;
import java.util.Objects;
public class emberekNeptun {
    private String nev;
    private int szev;
    private boolean nem; // No = férfi, Yes = nő
    private int jovedelem;
    public emberekNeptun(){
        this.nev="Senki Alfonz";
        this.szev = 2001;
        this.nem = false;
        this.jovedelem = 200000;
    }
    public emberekNeptun(String nev, int szev, boolean nem, int jovedelem) {
        this.nev = nev;
        this.szev = szev;
        this.nem = nem;
        this.jovedelem = jovedelem;
    }
    public String getNev() {
        return nev;
    }
    public int getSzev() {
        return szev;
    }
    public boolean isNem() {
        return nem;
    }
    public int getJovedelem() {
        return jovedelem;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public void setSzev(int szev) {
        this.szev = szev;
    }
    public void setNem(boolean nem) {
        this.nem = nem;
    }
    public void setJovedelem(int jovedelem) {
        this.jovedelem = jovedelem;
    }

    @Override
    public String toString() {
        return "emberekNeptun{" +
                "nev='" + nev + '\'' +
                ", szev=" + szev +
                ", nem=" + (nem?"Nő":"Férfi") +
                ", jovedelem=" + jovedelem + "EUR" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        emberekNeptun that = (emberekNeptun) o;
        return getSzev() == that.getSzev() && Objects.equals(getNev(), that.getNev());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNev(), getSzev());
    }
}
