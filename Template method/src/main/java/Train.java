public class Train extends TransportObject{
    public Train(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name+" запускает мотор ");

    }

    @Override
    void move() {
        System.out.println(name+" двигается по рельсам ");
    }

    @Override
    void horn() {
        System.out.println(name+" делате чух чух ");
    }

    @Override
    void stopEngine() {
        System.out.println(name+" глушит двигатель ");
    }
}
