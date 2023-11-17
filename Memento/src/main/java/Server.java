import java.util.Date;

public class Server {
    private String version;
    private Date date;

    public void setVersion(String version) {
        this.version = version;
        this.date=new Date();

    }
    public SaveConfig saveConfig(){
        return new SaveConfig(version);

    }
    public void loadVersion(SaveConfig saveConfig){
        this.version=saveConfig.getVersion();
        this.date=saveConfig.getDate();
        System.out.println("произошел откат ");
    }

    @Override
    public String toString() {
        return "Server{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
