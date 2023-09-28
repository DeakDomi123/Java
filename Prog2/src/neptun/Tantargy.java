package neptun;

import java.util.Objects;

public class Tantargy {
    private String nev;
    private String kod;
    private String oktato;
    private int erdemjegy;
    private int kredit;

    public Tantargy(String nev, String kod, String oktato, int erdemjegy, int kredit) {
        this.nev = nev;
        this.kod = kod;
        this.oktato = oktato;
        this.erdemjegy = erdemjegy;
        this.kredit = kredit;
    }

    public String getNev() {
        return nev;
    }

    public String getKod() {
        return kod;
    }

    public String getOktato() {
        return oktato;
    }

    public int getErdemjegy() {
        return erdemjegy;
    }

    public int getKredit() {
        return kredit;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setOktato(String oktato) {
        this.oktato = oktato;
    }

    public void setErdemjegy(int erdemjegy) {
        this.erdemjegy = erdemjegy;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    @Override
    public String toString() {
        return
                "nev='" + nev + '\'' +
                ", kod='" + kod + '\'' +
                ", oktato='" + oktato + '\'' +
                ", erdemjegy=" + erdemjegy +
                ", kredit=" + kredit +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tantargy tantargy = (Tantargy) o;
        return Objects.equals(getKod(), tantargy.getKod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKod());
    }
}
