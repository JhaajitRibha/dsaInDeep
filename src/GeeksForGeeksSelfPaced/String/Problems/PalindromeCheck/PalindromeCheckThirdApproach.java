package GeeksForGeeksSelfPaced.String.Problems.PalindromeCheck;

public class PalindromeCheckThirdApproach {
    public static boolean reverseCheck(String word){
        char[] wordArray = word.toCharArray();
        int low =0;
        int high = word.length()-1;
        while(low<high){
            if(wordArray[low]!=wordArray[high]){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(reverseCheck("malyalam"));
    }
}
