package GeeksForGeeksSelfPaced.String.Problems.PalindromeCheck;

public class PalindromeCheckFirstApproach {

    public static String reverse(String word){
        char[] wordsArray = word.toCharArray();
        char temp;
        for(int i=0;i<wordsArray.length/2;i++){
            temp = wordsArray[i];
            wordsArray[i]=wordsArray[wordsArray.length-1-i];
            wordsArray[wordsArray.length-1-i]=temp;
        }

        String res = new String(wordsArray);
        return res;
    }

    public static boolean palindromeCheck(String word){
        return word.equals(reverse(word));
    }

    public static void main(String[] args) {
        System.out.println(palindromeCheck("ajit"));
        System.out.println(palindromeCheck("malayalam"));
        System.out.println(palindromeCheck("ABCDCBA"));
        System.out.println(palindromeCheck("ABBA"));
        System.out.println(palindromeCheck("GEEKS"));
    }
}
