package leetcodePatternWisePhase1.GroupAnagram49;

import leetcodePatternWisePhase1.CheckAnagram242.CA242BetterApproach;
import leetcodePatternWisePhase1.CheckAnagram242.CA242BruteForce;

import java.util.ArrayList;
import java.util.List;

public class GA49BruteForce {
    public static List<List<String>> groupAnagrams(String[] strs) {

        //["eat","tea","tan","ate","nat","bat"]
        List<List<String>> res = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            List<String> anagrams = new ArrayList<>();
            if(visited[i]){
                continue;
            }
            anagrams.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(visited[j]){
                    continue;
                }
                if(CA242BetterApproach.isAnagramBetter(strs[i],strs[j])){
                    anagrams.add(strs[j]);
                    visited[j]=true;
                }
            }

                res.add(anagrams);

        }
        return res;
    }


    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = {""};
       List<List<String>> anagramsList= groupAnagrams(strs);
       anagramsList.forEach(anagram->{
           for (String s : anagram) {

               System.out.print(s + " ");
           }
           System.out.println();
       });


    }
}
