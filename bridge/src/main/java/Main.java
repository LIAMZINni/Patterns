import typesOfMusicDevices.Headphones;
import typesOfMusicDevices.MusicDevice;

public class Main {
    public static void main(String[] args) {
        MusicDevice musicDevice=new Headphones();
        MusicManageSystem manageSystem=new SimpleMusicManageSystem(musicDevice);
        manageSystem.startSystem();
    }
}
