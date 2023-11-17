import java.util.*;

public class PlayList implements ComponentMusic{
    private String name;
    private List<ComponentMusic> componentMusics;
    private List<Album> albumList=new ArrayList<>();

    public PlayList(String name) {
        this.name = name;
        this.componentMusics = new ArrayList<>();



    }
    public void addAlbum(Album album){
        albumList.add(album);





    }
    public void addSong(ComponentMusic song){
        componentMusics.add(song);

    }

    @Override
    public void play() {
        System.out.println("playing playlist "+name);
        PrintAll.printAll(albumList);
        PrintAll.printAll(componentMusics);


    }

}
