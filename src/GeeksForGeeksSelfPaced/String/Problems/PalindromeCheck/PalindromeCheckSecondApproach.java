package GeeksForGeeksSelfPaced.String.Problems.PalindromeCheck;

public class PalindromeCheckSecondApproach {

    public static boolean reverseCheck(String word){
        StringBuilder rev = new StringBuilder(word).reverse();
        return word.equals(rev.toString());

    }
    public static void main(String[] args) {

        System.out.println(reverseCheck("malyalam"));

    }

}
