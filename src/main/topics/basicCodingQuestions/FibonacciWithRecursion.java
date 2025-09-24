package basicCodingQuestions;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        System.out.println(printFib(7));
    }

    public static int printFib(int num){
        if(num<=1) return num;
        return printFib(num-1)+printFib(num-2);
    }
}
