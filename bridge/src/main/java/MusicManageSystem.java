import typesOfMusicDevices.MusicDevice;

public abstract class MusicManageSystem {
    protected MusicDevice musicDevice;

    public MusicManageSystem(MusicDevice musicDevice) {
        this.musicDevice = musicDevice;
    }
    public abstract void startSystem();
}
