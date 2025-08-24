package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CountTheOccurancesInString {
    public static void main(String[] args) {
        String str = "Purushottam";

        Map<Character, Long> charwiseCount = str.chars().
        mapToObj(c -> (char) c)
                .sorted()
                .collect(
                Collectors.groupingBy(n->n, Collectors.counting())
        );

        for (Map.Entry<Character, Long> obj: charwiseCount.entrySet()){
            System.out.println(obj.getKey()+" "+obj.getValue());
        }

    }
}
