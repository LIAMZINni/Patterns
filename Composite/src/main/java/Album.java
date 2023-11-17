import java.util.ArrayList;
import java.util.List;

public class Album implements ComponentMusic{
    private String name;
    private String autor;
    private List<ComponentMusic> musicList;

    public Album(String name,String autor) {
        this.name = name;
        this.musicList = new ArrayList<>();
        this.autor=autor;
    }

    public String getName() {
        return name;
    }
    public void addSong(ComponentMusic componentMusic){
        musicList.add(componentMusic);
    }

    public List<ComponentMusic> getMusicList() {
        return musicList;
    }


    @Override
    public void play() {
        System.out.println();
        System.out.println("playing album "+name+" - "+autor);
        PrintAll.printAll(musicList);

        System.out.println();

    }
}
