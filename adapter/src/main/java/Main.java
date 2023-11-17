public class Main {
    public static void main(String[] args) {
        StorageDevice storageDevice=new USBAdapter();
        storageDevice.readFile();
        storageDevice.writeFile();
        StorageDevice sdCart=new SDCartAdapter();
        sdCart.writeFile();
        sdCart.readFile();
    }
}
