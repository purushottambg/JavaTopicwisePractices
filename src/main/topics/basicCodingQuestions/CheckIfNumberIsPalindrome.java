package basicCodingQuestions;

public class CheckIfNumberIsPalindrome {
    public static void main(String[] args) {
        int num=24;
        boolean flag=true;
        for (int i=2;i<num/2;i++)
            if(num%i==0) flag=false;

        if(flag) System.out.println("prime");
        else System.out.println("Non-prime");
    }
}
