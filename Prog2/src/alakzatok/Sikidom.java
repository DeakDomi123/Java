package alakzatok;

public abstract class Sikidom implements Alakzat{
    public final int dimenzio(){
        return 2;
    }
    public final double kerulet(){
        return felszin();
    }
    public final double terulet(){
        return terfogat();
    }
    @Override
    public int compareTo(Merheto o) {
        if(o==null){
            return 1;
        }
        else{
            return Double.compare(this.terfogat(), o.terfogat());
        }
    }
}
