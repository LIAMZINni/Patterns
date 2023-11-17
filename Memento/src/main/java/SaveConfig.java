import java.util.Date;

public class SaveConfig {
    private final String version;
    private final Date date;

    public SaveConfig(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
