public abstract class TransportObject {
    String name;

    public TransportObject(String name) {
        this.name = name;
    }

    abstract void startEngine();
    abstract void move();
    abstract void horn();
    abstract void stopEngine();
    void drive(){
        getOnTransport();
        startEngine();
        move();
        horn();
        stopEngine();
        System.out.println();
    }
    void getOnTransport(){
        System.out.println("сажусь в транспорт ");
    }


}
