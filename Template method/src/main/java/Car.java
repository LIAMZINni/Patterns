public class Car extends TransportObject{
    public Car(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name+" завелся мотор  ");
    }

    @Override
    void move() {
        System.out.println(name+" двигается по дороге ");

    }

    @Override
    void horn() {
        System.out.println(name+" делает бип бип ");

    }

    @Override
    void stopEngine() {
        System.out.println(name+" двигатель заглушен ");

    }
}
