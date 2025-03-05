package streams1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxValueInList {

    public void maxValueInList(List<Integer> numbers){
        numbers.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
    }
}
