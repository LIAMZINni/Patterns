public class USBAdapter extends USB implements StorageDevice {
    @Override
    public void readFile() {
    connect();
    read();
    disconnect();

    }

    @Override
    public void writeFile() {
        connect();
        write();
        disconnect();

    }


}
