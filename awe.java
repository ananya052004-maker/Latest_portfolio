import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class awe {
    
    public static List<String> sortStrings(List<String> strings) {
        List<String> sortedList = new ArrayList<>(strings);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static String searchString(List<String> strings, String target) {
        int index = strings.indexOf(target);
        if (index != -1) {
            return "'" + target + "' found in the list at index " + index + ".";
        } else {
            return "'" + target + "' not found in the list.";
        }
    }

    public static List<String> reverseStrings(List<String> strings) {
        List<String> reversedList = new ArrayList<>(strings);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "cherry", "date", "elderberry");

        List<String> sortedList = sortStrings(stringList);
        System.out.println("Sorted List: " + sortedList);

        String searchResult = searchString(stringList, "banana");
        System.out.println("Search Result: " + searchResult);

        List<String> reversedList = reverseStrings(stringList);
        System.out.println("Reversed List: " + reversedList);
    }
}

