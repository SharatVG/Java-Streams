package streams1;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {

    public void sumOfAllElements(List<Integer> numbers){
        int sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        int sum2 = numbers.stream()
                .mapToInt(Integer::intValue) // Converts Stream<Integer> to IntStream
                .sum();
        System.out.println(sum2);

        int sum3 = numbers.stream()
                .reduce(0, Integer::sum); // Initial value = 0, sum function applied
        System.out.println(sum3);

        //using parallel Streams
        int sum4 = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum4);


    }


}
