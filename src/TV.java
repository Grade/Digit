
public class TV extends Device implements SoundMaker {

    private int diagonal;

    public TV(int volts, int diagonal, String name) {
        super(volts, name);
        this.diagonal = diagonal;
    }

    @Override
    void work() {
        System.out.println("Show movies on " + diagonal + " inches");
    }

    @Override
    public void makeSound() {
        System.out.println(deviceName + " says BEEP");
    }
}
