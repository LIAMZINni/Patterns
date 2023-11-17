import typesOfMusicDevices.MusicDevice;

public class SimpleMusicManageSystem extends MusicManageSystem{
    public SimpleMusicManageSystem(MusicDevice musicDevice) {
        super(musicDevice);
    }

    @Override
    public void startSystem() {
        System.out.println(musicDevice.playMusic());

    }
}
