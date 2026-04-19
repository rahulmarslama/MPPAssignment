package Lab13.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(-2, -1, 0, 1, 2));
        Group<Integer> intGroup = new Group<>(0, ints);
        System.out.println("Original: " + intGroup);

        Group<?> intCopy = Group.copy(intGroup);
        System.out.println("Copy:     " + intCopy);

        List<String> words = new ArrayList<>(Arrays.asList("hello", "world", "java"));
        Group<String> strGroup = new Group<>("hello", words);
        System.out.println("Original: " + strGroup);

        Group<?> strCopy = Group.copy(strGroup);
        System.out.println("Copy:     " + strCopy);
    }
}
