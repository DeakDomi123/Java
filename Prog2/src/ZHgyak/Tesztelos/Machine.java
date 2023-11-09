package ZHgyak.Tesztelos;

public abstract class Machine implements InfoInterface{
    private int id;

    public Machine(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    //protected String name = "1.es tipusi gep";

    @Override
    public void showInfo() {
        System.out.println("Machine id: " + id);
    }
    public abstract void start();
    public abstract void stop();
}
