package randomDSA;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromOrIfCanCoonvertedTo {
    public static void main(String[] args) {
        String str = "aedadaa";   // daaeaad
        System.out.println("Can/Cs "+str+" Palindrome:"+PalindromeReadyString(str));
    }

    public static boolean PalindromeReadyString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=str.length()-1;i>=0;i--) {
            stringBuilder=stringBuilder.append(str.charAt(i));
        }

        if (str.equals(stringBuilder)) return true;
        else if (canConvertToPalindrome(str)) return true;
        return false;
    }

    public static boolean canConvertToPalindrome(String str){
        int counter=0;
        HashMap<Character, Integer> charCounter = new HashMap<>();
        for (Character c: str.toCharArray()){
            charCounter.put(c, charCounter.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character, Integer> map: charCounter.entrySet() ){
            if (map.getValue()%2!=0) counter++;
        }

        if (counter>1) return false;
        return true;
    }
}
