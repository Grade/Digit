
public abstract class Device {

    private int volts;
    protected String deviceName;

    public Device(int volts, String deviceName) {
        if(volts < 0) {
            System.out.println("Wrong volts: " + volts);
        }
        this.volts = volts;
        this.deviceName = deviceName;
    }

    void start() {
        System.out.println(deviceName + " started with " + volts + "V");
    }

    abstract void work();

}
