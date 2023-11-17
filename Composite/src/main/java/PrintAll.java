import java.util.List;
public interface PrintAll {
    public static  <T extends ComponentMusic>void printAll(List<T> list){
        for (T t:list
             ) {
            t.play();

        }

    }

}
