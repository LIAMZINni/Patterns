import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlayList playList=new PlayList("New");
        Album album=new Album("Акустический ","КиШ");
        Song song =new Song("КиШ","Утренний рассвет ");
        Song song2 =new Song("КиШ ","Прыгну со скалы ");
        Song song1 =new Song("Kirkorov ","snow");
        album.addSong(song);
        album.addSong(song2);

        playList.addAlbum(album);
        playList.addSong(song1);
        playList.play();

    }
}
