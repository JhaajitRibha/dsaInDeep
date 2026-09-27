package leetcodePatternWisePhase1.CheckAnagram242;

public class CA242BasicBruteForce {
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char[] string2 = t.toCharArray();

        for(int i =0;i<s.length();i++){
            char current = s.charAt(i);
            boolean flag=false;
            for(int j=0;j<string2.length;j++){
                if(string2[j] != '*' && current==string2[j]){
                    string2[j]='*';
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
    }
}
