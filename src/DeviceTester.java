
public class DeviceTester {

    public void testDevices(Device[] devices) {
        for (int i = 0; i < devices.length; i++) {
            Device device = devices[i];
            testDevice(device);
        }
    }

    public void testSound(SoundMaker d) {
        d.makeSound();
    }

    public void testDevice(Device d) {
        System.out.println("=== START ===");
        d.start();
        d.work();
        System.out.println("=== END ===");
    }
}
