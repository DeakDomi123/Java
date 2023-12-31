package ZHgyak.Tesztelos;

public class Robot {
    private int id;
    private class Brain{
        public void think(){
            System.out.println("Robot " +id + " is thinking.");
        }
    }

    public  static class Battery{
        public void charge(){
            System.out.println("Battery charging: ");
        }
    }
    public Robot(int id) {
        this.id = id;
    }
    public void start(){
        System.out.println("Starting robot " + id);
        Brain brain = new Brain();
        brain.think();
    }
}
