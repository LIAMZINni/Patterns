public class Bicycle extends TransportObject{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name+" двигателя нема");
    }

    @Override
    void move() {
        System.out.println(name+" передвигается по велодорожке ");

    }

    @Override
    void horn() {
        System.out.println(name+"делает дзынь дзынь ");

    }

    @Override
    void stopEngine() {
        System.out.println(name+" глушить нечего ");
    }
}
