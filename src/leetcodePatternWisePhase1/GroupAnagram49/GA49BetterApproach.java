package leetcodePatternWisePhase1.GroupAnagram49;

import java.util.*;

public class GA49BetterApproach {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //["eat","tea","tan","ate","nat","bat"]
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String sorted = sortString(strs[i]);
//            if(map.containsKey(sorted)){
//                List<String> existedList = map.get(sorted);
//                existedList.add(strs[i]);
//            }else{
//                List<String> newList = new ArrayList<>();
//                newList.add(strs[i]);
//                map.put(sorted,newList);
//            }
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }

        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String,List<String>> s : map.entrySet()){
            res.add(s.getValue());
        }

        return res;
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();   // convert to char array
        Arrays.sort(arr);               // sort array
        String sorted = new String(arr);
        return sorted;// convert back to string
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>>  res = groupAnagrams(strs);
        res.forEach(x->{
            x.forEach(y->{
                System.out.print(y+" ");
            });
            System.out.println();
        });

    }
}
