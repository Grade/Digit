public class Rozetka {

    public static void main(String[] args) {
        Device tv = new TV(220, 40, "LG");
        Device tv2 = new TV(220, 30, "Panasonic");
        Device c = new Conditioner(220, "Samsung", 10, 30);

        Device[] devices = new Device[]
                {
                        tv,
                        tv2,
                        c
                };

        DeviceTester tester = new DeviceTester();
        tester.testDevices(devices);

        SoundMaker tv3 = new TV(220, 25, "Sony");
        tester.testSound(tv3);
    }

}
