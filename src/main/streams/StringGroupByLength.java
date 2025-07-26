import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;
import java.util.stream.Collectors;

public class StringGroupByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.stream("Hum tum itne pass aarhe hai , kabhi dur na jaaye".split(" ")).toList();

        Map<Integer, List<String>> stringMap = strings.stream().collect(
                Collectors.groupingBy(String::length)
        );

        for (Map.Entry<Integer, List<String>> obj: stringMap.entrySet() ){
            System.out.println(obj.getKey()+"->"+obj.getValue());
        }
    }
}
