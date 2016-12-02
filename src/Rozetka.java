
public class Rozetka {

    public static void main(String[] args) {
        TV tv = new TV(220, 40, "LG");
        Conditioner c = new Conditioner(220, "Samsung", 10, 30);

        tv.start();
        tv.workTv();
        c.start();
        c.workConditioner();

    }

}
