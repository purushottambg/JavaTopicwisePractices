import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitStringStreamLengthwise {
    public static void main(String[] args) {
        List<String> strings = Arrays.stream("Hum tum itne pass aarhe hai , kabhi dur na jaaye".split(" ")).toList();

        Map<Boolean, List<String>> evenOddStrings = strings.stream().collect(Collectors.partitioningBy(n->n.length()%2==0));

        for (Map.Entry<Boolean, List<String>> obj: evenOddStrings.entrySet()){
            if (obj.getKey()){
                System.out.print("Even:"+obj.getValue());
            }
            System.out.print("\nOdd:"+obj.getValue());
        }
    }
}
