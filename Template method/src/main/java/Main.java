public class Main {
    public static void main(String[] args) {

        TransportObject car = new Car("bnw");
        TransportObject bike = new Bicycle("bmx");
        TransportObject train = new Train("train");
        car.drive();
        bike.drive();
        train.drive();
    }

}
