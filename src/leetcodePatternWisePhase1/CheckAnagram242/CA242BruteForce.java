package leetcodePatternWisePhase1.CheckAnagram242;

import java.util.HashMap;
import java.util.Map;

public class CA242BruteForce {
    public static boolean isAnagramOptimal(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }
    public static boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if (sArray.length != tArray.length) {
            return false;
        }
        Map<Character,Integer> sArrayMap = new HashMap<>();
        Map<Character,Integer> tArrayMap = new HashMap<>();
        for(int i=0;i<sArray.length;i++){
            sArrayMap.put(sArray[i],sArrayMap.getOrDefault(sArray[i],0)+1);
        }
        for(int i=0;i<tArray.length;i++){
            tArrayMap.put(tArray[i],tArrayMap.getOrDefault(tArray[i],0)+1);
        }
        for(Map.Entry<Character,Integer> entry : sArrayMap.entrySet()){
            if (!tArrayMap.containsKey(entry.getKey()) || !tArrayMap.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaaram";
        System.out.println(isAnagram(s,t));
        System.out.println(isAnagramOptimal(s,t));

    }
}
