package ZHgyak.FarkasFruzsi.ora4.sokszogekOnallo;

public abstract class Sokszog {
    private int szogekSzama;
    public Sokszog(){
    }

    public Sokszog(int szogekSzama) {
        if(szogekSzama < 3){
            szogekSzama = 3;
        }
        this.szogekSzama = szogekSzama;
    }
    abstract double kerulet();
    abstract double terulet();

    public int getSzogekSzama() {
        return szogekSzama;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sokszog{");
        sb.append("szogekSzama=").append(szogekSzama);
        sb.append('}');
        return sb.toString();
    }
}
