package leetcodePatternWisePhase1.GroupAnagram49;

import java.util.*;

public class GA49Optimal {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] freq = new int[26];
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                keyBuilder.append(freq[i]);
                keyBuilder.append('#');
            }

            String key = keyBuilder.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> res = groupAnagrams(strs);

        for (List<String> group : res) {
            System.out.println(group);
        }
    }
}