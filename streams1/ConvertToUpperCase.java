package streams1;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    public void convertToUpperCase(List<String> inputList) {
        inputList.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> newList = inputList.stream().map(String::toUpperCase).collect(Collectors.toList());

        //replace all not stream
        inputList.replaceAll(String::toUpperCase); // Modify list directly
    }
}
