public abstract class Device {
    public abstract void connect();


    public void read(){
        System.out.println("read data");
    }
    public void write(){
        System.out.println("write data");
    }
    public abstract void disconnect();
}
