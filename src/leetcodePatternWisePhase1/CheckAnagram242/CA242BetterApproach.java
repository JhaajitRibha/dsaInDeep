package leetcodePatternWisePhase1.CheckAnagram242;

import java.util.Arrays;

//TODO:followup pending

public class CA242BetterApproach {
    public static boolean isAnagramBetter(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }//space complexityu nothong already input given
        int[] sContainer = new int[26]; //space complexity O(1),time complexity -O(1)


        for(int i=0;i<s.length();i++){
            sContainer[s.charAt(i)-'a']++;
        }      //time complexity o(N)
        for(int i=0;i<t.length();i++){
            sContainer[t.charAt(i)-'a']--;
        }//time complexity - O(N)
        for(int i=0;i<sContainer.length;i++){
            if(sContainer[i]!=0){
                return false;
            }
        }//tmie complexity- O(1)

        //total time complexity - 0(N) ,space complexity  - O(1)
        return true;
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] sContainer = new int[26];
        int[] tContainer = new int[26];

        for(int i=0;i<s.length();i++){
            sContainer[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            tContainer[t.charAt(i)-'a']++;
        }
        for(int i=0;i<sContainer.length;i++){
            if(sContainer[i]!=tContainer[i]){
                return false;
            }
        }
      return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
        System.out.println(isAnagramBetter(s,t));
    }
}
