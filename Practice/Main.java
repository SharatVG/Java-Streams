package Practice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
/*        Given a list of integers, use streams to create a new list where each number is doubled.
        Example Input: [1, 2, 3, 4, 5]
        Expected Output: [2, 4, 6, 8, 10]*/
        System.out.println("Starting the Streams Exersise problems");
        System.out.println("------------------------------------------");
        List<Integer> nums = List.of(1,2,3,4,5,6);
        List<String> strings = List.of("Sharat", "Anvesh", "Ravi", "Maria", "Sahil");

        System.out.println("Before Transformation ");
        printNums(nums);
        System.out.println("After Transformation");
        List<Integer> doubledNums = nums.stream().map(n -> n*n).collect(Collectors.toUnmodifiableList());
        printNums(doubledNums);
        System.out.println("------------------------------------------");

        System.out.println("Filter even numbers");
        System.out.println("Before Transformation");
        printNums(nums);
        List<Integer> evenNumbers = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toUnmodifiableList());
        System.out.println("after transformation");
        printNums(evenNumbers);
        System.out.println("------------------------------------------");

        System.out.println("Convert names to uppercase");
        System.out.println("before Transformation");
        printStrings(strings);
        List<String> upcaseList = strings.stream().map(String::toUpperCase).collect(Collectors.toUnmodifiableList());
        printStrings(upcaseList);
        System.out.println("------------------------------------------");

        System.out.println("Find squares of numbers greater than 5");
        System.out.println("before Transformation");
        printNums(nums);
        List<Integer> integerList = nums.stream().filter(n -> n > 5).map(n -> n * n)
                .collect(Collectors.toUnmodifiableList());
        printNums(integerList);
        System.out.println("------------------------------------------");

        System.out.println("Find max lenth in a string");
        System.out.println("before Transformation");
        printStrings(strings);
        int maxLength = strings.stream().map(String::length).max(Integer::compare).get();
        System.out.println(String.format("max Length is %d", maxLength));
        System.out.println("------------------------------------------");

//        System.out.println("Find Longest word in a string");
//        System.out.println("before Transformation");
//        printStrings(strings);
//        strings.stream().map(String::length).

    }

    public static void printNums(List<Integer> nums) {
        nums.forEach(num -> System.out.print(" " + num));
        System.out.println();
    }

    public static void printStrings(List<String> strings) {
        strings.forEach(str -> System.out.print(" " + str));
        System.out.println();
    }

}
