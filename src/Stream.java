import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Anna", "Anjela","Bob");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
