package ZHgyak.Tesztelos;

public class Camera extends Machine{
    private int id;
    public Camera(int id) {
        super(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void start() {
        System.out.println("Machine has started");
    }

    @Override
    public void stop() {
        System.out.println("Machine has stopped");
    }
}
