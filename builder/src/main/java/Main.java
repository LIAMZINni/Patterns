public class Main {
    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder("Lada", "priora", "black", false);
        AutomotiveEngineer automotiveEngineer = new AutomotiveEngineer(carBuilder);
        Car car = automotiveEngineer.createCar();
        System.out.println(car.toString());

    }
}
