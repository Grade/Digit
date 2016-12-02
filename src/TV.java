
public class TV extends Device {

    private int diagonal;


    public TV(int volts, int diagonal, String name) {
        super(volts, name);
        this.diagonal = diagonal;
    }

    void workTv() {
        System.out.println("Show movies on " + diagonal + " inches");
    }

}
