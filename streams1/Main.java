package streams1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 6, 3, 2, 5, 4, 7, 7);
        List<String> stringList = List.of("sharat", "anvesh", "arockia", "shilpa", "shashank");

        System.out.println("Get All Even numbers from List of Integer Nums");
        list.stream().filter(n -> n % 2 ==0) .forEach(num -> System.out.print(num + ","));
        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("Get Max Value from List of Integer Nums");
        int findMaximum = list.stream().max(Integer::compare).get();
        System.out.println("max value : "+findMaximum);

        System.out.println("-----------------------------------");
        System.out.println("Get Sum of elements from a List of Integer Nums");
        int totalSum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total value : "+totalSum);

        System.out.println("-----------------------------------");
        System.out.println("Convert List of String to Upper case");
        List<String> upperCaseList1 = stringList.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        //stringList.stream().map(String::toUpperCase).forEach(System.out::println);
        //upperCaseList1.forEach(str -> System.out.print(str + ", "));
        System.out.println(String.join(",", upperCaseList1));

        System.out.println("-----------------------------------");
        System.out.println("Sort a List By natural Order");
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(String.join(",", sortedList));

        System.out.println("-----------------------------------");
        System.out.println("Count Elements");
        long listCount = stringList.stream().count();
        System.out.println("Count of the List is "+ listCount);

        System.out.println("-----------------------------------");
        System.out.println("Get Distinct Elements");
        list.stream().distinct().forEach(num -> System.out.print(num + ","));

        System.out.println("-----------------------------------");
        System.out.println("Reduce the list to there sum");
        int sum = list.stream().distinct().reduce(0, Integer::sum);
        System.out.println("reduced sum of the list is "+sum);

        System.out.println("-----------------------------------");
        System.out.println("Find any elements from the list");
        list.stream().findAny().ifPresent(System.out::println);

        System.out.println("-----------------------------------");
        System.out.println("Find first elements from the list");
        list.stream().findFirst().ifPresent(System.out::println);

        System.out.println("-----------------------------------");
        System.out.println("Check if all the elements are positive");
        System.out.println(list.stream().allMatch(n -> n >0));

        System.out.println("-----------------------------------");
        System.out.println("Check if none of the elements are positive");
        System.out.println(list.stream().noneMatch(n ->  n > 100));

        System.out.println("-----------------------------------");
        System.out.println("Check if none of the elements are positive");
        List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(List.of("A", "B"));
        nestedList.add(List.of("C", "D"));
        List<String> newFlatList = nestedList.stream().flatMap(List::stream)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(String.join(", ", newFlatList));

        System.out.println("-----------------------------------");
        System.out.println("Group Users by there age");
        List<User> users = new ArrayList<>();
        users.add(new User("sharat", "gangal", 27));
        users.add(new User("Sagar", "Pawar", 26));
        users.add(new User("kartik", "patil", 27));
        Map<Integer, List<User>> usersByAge = users.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println(usersByAge.toString());

        System.out.println("-----------------------------------");
        System.out.println("peak elements");
        users.stream().peek( user -> System.out.println(user.toString()))
                .collect(Collectors.toUnmodifiableList());

        System.out.println("-----------------------------------");
        System.out.println("limit elements");
        users.stream().limit(1).peek( user -> System.out.println(user.toString()))
                .collect(Collectors.toUnmodifiableList());

        System.out.println("-----------------------------------");
        System.out.println("to Set elements");
        Set<Integer> numsSet = list.stream().collect(Collectors.toSet());
        numsSet.forEach(num -> System.out.print(num + ","));

        System.out.println("-----------------------------------");
        System.out.println("to elements average");
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("max : " +intSummaryStatistics.getMax());
        System.out.println("min : " +intSummaryStatistics.getMin());
        System.out.println("average : " +intSummaryStatistics.getAverage());
    }
}
