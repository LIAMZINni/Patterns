public class Song implements ComponentMusic{
    @Override
    public void play() {
        System.out.println("playing "+autor+" - "+name);
    }

    private String name;
    private String autor;

    public Song(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }
}
