public class AutomotiveEngineer {
    private CarBuilder carBuilder;

    public AutomotiveEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car createCar(){
        return carBuilder.buildCar();
    }
}
