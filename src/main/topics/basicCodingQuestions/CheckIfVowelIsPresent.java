package basicCodingQuestions;

public class CheckIfVowelIsPresent {
    public static void main(String[] args) {
        String str="ExampleString";
        String vowels="aeiou";
        boolean contains = str.chars().mapToObj(c->(char)c).anyMatch(c->vowels.contains(c.toString()));
        System.out.println("Does the string contains vowels: "+contains);
    }
}
