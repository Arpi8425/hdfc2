import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        // Filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

//Count words starting with a
        List<String> words = Arrays.asList("Apple","Ball","Ant");
        long count = words.stream()
                .filter(w -> w.startsWith("A"))
                .count();
        System.out.println(count);


        //Remove Duplicates from list
        List<Integer>list = Arrays.asList(1,2,2,3,3,3,4);
        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);



    }

}


