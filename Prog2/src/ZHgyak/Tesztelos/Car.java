package ZHgyak.Tesztelos;

public class Car extends Machine{
    public Car(int id) {
        super(id);
    }

    @Override
    public void start() {
        System.out.println("Overrided the machine has started.");
    }

    @Override
    public void stop() {

    }
}
