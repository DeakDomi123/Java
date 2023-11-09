package alakzatok;

public abstract class Test implements Alakzat{
    public final int dimenzio(){
        return 3;
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
