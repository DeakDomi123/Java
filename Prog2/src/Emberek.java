import java.util.Objects;

public class Emberek{
    private String vezeteknev;
    private String keresztnev;
    private String anyjaneve;
    private int szuletesiEv;
    private String szig;
    /*public Ember(){
        this.vezeteknev = "Jakab";
        this.keresztnev = "József";
        this.anyjaneve = "Katalin";
        this.szuletesiEv = 1990;
        this.szig = "123456AB";
    }*/
    public Emberek(String vezeteknev, String keresztnev, String anyjaneve, int szuletesiEv, String szig){
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.anyjaneve = anyjaneve;
        this.szuletesiEv = szuletesiEv;
        this.szig = szig;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public String getAnyjaneve() {
        return anyjaneve;
    }

    public int getSzuletesiEv() {
        return szuletesiEv;
    }

    public String getSzig() {
        return szig;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }
    public int getEletkor(){
        return 2023 - szuletesiEv;
    }
    public String toString(){
        return getVezeteknev() + ", " + getKeresztnev() + ", " + getAnyjaneve() + ", " + getSzuletesiEv() + ", " + getSzig();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emberek emberek = (Emberek) o;
        return szuletesiEv == emberek.szuletesiEv && Objects.equals(vezeteknev, emberek.vezeteknev) && Objects.equals(keresztnev, emberek.keresztnev) && Objects.equals(anyjaneve, emberek.anyjaneve) && Objects.equals(szig, emberek.szig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vezeteknev, keresztnev, anyjaneve, szuletesiEv, szig);
    }
}