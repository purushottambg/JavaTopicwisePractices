package basicCodingQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "REverseString";
        StringBuilder sb = new StringBuilder();
        for (int i=str.length()-1; i>=0;i--)
            sb=sb.append(str.charAt(i));

        System.out.println(sb);

    }
}
