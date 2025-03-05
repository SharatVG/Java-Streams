package streams1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public void filterEvenNumbers(List<Integer> numbers){

        //printing even numbers
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //getSum of All even numbers
       int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n.intValue()).sum();
        System.out.println(sum);

       //get new list of even numbers
        List<Integer> list1 = numbers.stream().filter(n-> n % 2 ==0).
                peek(n -> System.out.print(n +",")).collect(Collectors.toList());
        System.out.println();
        List<Integer> list2 = numbers.stream().filter(n-> n % 2 ==0).
                peek(n -> System.out.print(n +",")).collect(Collectors.toUnmodifiableList());



    }
}
