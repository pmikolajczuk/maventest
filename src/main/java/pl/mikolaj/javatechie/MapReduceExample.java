package pl.mikolaj.javatechie;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 8, 1, 5, 9);
        List<String> words = List.of("corejava", "spring", "hibernate", "spring");

        int sum = 0;
        for(Integer n : numbers) {
            sum+= n;
        }
        System.out.println(sum);

        Integer sumStream = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sumStream);

        Integer maxValue = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValue);

        String longest = words
                .stream()
                .reduce((s, s2) -> s.length() >= s2.length() ? s : s2)
                .get();
        System.out.println(longest);

        Comparator<String> byLength = Comparator.comparing(String::length);
        String longestV2 = words
                .stream()
                .reduce(BinaryOperator.maxBy(byLength))
                .get();
        System.out.println(longestV2);

        Map<String, List<String>> words2words = words.stream().collect(Collectors.groupingBy(s -> s));
        System.out.println(words2words);

        Map<String, Integer> words2count = words
                .stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.reducing(0, s -> 1, Integer::sum)));
        System.out.println(words2count);

        Map<String, Integer> words2length = words
                .stream()
                .collect(Collectors.toMap(s -> s, String::length, (l1, l2) -> l1));
        System.out.println(words2length);
    }
}
