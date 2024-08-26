package GeeksForGeeksSelfPaced.String.Videos.LeftMostNonRepeatingElement;

import java.util.Arrays;

public class LMNRE_A2 {

    public static char nonRepeatingCharacter(String word){
        int[] count = new int[26];
        Arrays.fill(count,0);

        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
        }

        for(int i=0;i<word.length();i++){
            if(count[word.charAt(i)-'a']==1){
                return word.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {

        System.out.println(nonRepeatingCharacter("racecars"));
    }
}
