package gfg160.strings.anagram;

import java.util.Arrays;

public class anagramA1 {
    public static boolean areAnagrams(String s1, String s2) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        for(int i=0;i<s1.length();i++){
            counts1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            counts2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<counts1.length;i++){
            if(counts2[i]!=counts1[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "g";
        String s2 = "g";
        System.out.println(areAnagrams(s1,s2));
    }
}
