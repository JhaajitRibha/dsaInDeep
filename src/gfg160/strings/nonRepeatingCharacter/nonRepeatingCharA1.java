package gfg160.strings.nonRepeatingCharacter;

public class nonRepeatingCharA1 {
    public static char nonRepeatingChar(String s) {

        int[] counts1 = new int[26];
        for(int i=0;i<s.length();i++){
            counts1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++) {
            if(counts1[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("aabbccc"));
    }
}
