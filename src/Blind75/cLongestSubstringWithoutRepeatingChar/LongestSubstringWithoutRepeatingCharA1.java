package Blind75.cLongestSubstringWithoutRepeatingChar;

public class LongestSubstringWithoutRepeatingCharA1 {
    public int lengthOfLongestSubstring(String s) {

        char[] characters = s.toCharArray();
        int count=0;
        for(int i=0;i<characters.length-1;i++){
            if(characters[i]==characters[i+1]){
                count++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

    }
}
