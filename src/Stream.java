import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Anna","Bob","Jwe","Cas","Pos");
        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
