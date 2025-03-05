package streams1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        List<String> stringList = List.of("sharat", "anvesh", "arockia", "shilpa", "Shashank");

//        FilterEvenNumbers filterEvenNumbers  =new FilterEvenNumbers();
//        filterEvenNumbers.filterEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7));

//        MaxValueInList maxValueInList = new MaxValueInList();
//        maxValueInList.maxValueInList(List.of(1, 2, 3, 4, 5, 6, 7));

//        SumOfElements sumOfElements = new SumOfElements();
//        sumOfElements.sumOfAllElements(list);

        ConvertToUpperCase convertToUpperCase = new ConvertToUpperCase();
        convertToUpperCase.convertToUpperCase(stringList);
    }
}
