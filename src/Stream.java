import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5,10,15,20,25);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                .map(n -> n*2)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
