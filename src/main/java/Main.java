import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8, 11);

        List<Integer> result = sameNumbers(list1, list2);
        System.out.println(result);
    }

    public static List<Integer> sameNumbers(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> set = new HashSet<>(list1);
        List<Integer> commonElements = new ArrayList<>();

        for (Integer num : list2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}