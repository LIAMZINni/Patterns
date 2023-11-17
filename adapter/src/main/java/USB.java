public class USB extends Device {

    @Override
    public void connect() {
        System.out.println("USB connect");
    }

    @Override
    public void disconnect() {
        System.out.println("USB disconnect");

    }
}
