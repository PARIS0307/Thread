import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name ,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}
public class StreamWithObjects {
     public static void main(String[] args) {
         List<Student> students = Arrays.asList(
                 new Student(1 , "John" , 20),
                 new Student(2 , "Anna" , 23),
                 new Student(3 ,"Bob" , 14)
         );

         List<Student> result = students.stream()
                 .filter(e -> e.age>18)
                 .collect(Collectors.toList());

         result.forEach(System.out::println);
    }
}
