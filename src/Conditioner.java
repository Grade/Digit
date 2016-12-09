

public class Conditioner extends Device {

    private int minTemperature;
    private int maxTemperature;

    public Conditioner(int volts, String name, int minTemperature, int maxTemperature) {
        super(volts, name);
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    @Override
    void work() {
        System.out.println("Change temperature " + minTemperature + "->" + maxTemperature);
    }
}
