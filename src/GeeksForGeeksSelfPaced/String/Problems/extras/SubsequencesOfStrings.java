package GeeksForGeeksSelfPaced.String.Problems.extras;

import java.util.ArrayList;

public class SubsequencesOfStrings {

    public static ArrayList<String> substrings(String word){

        ArrayList<String> res = new ArrayList<>();
        res.add("");

        for(char ch:word.toCharArray()){
            int size = res.size();
            for(int i=0;i<size;i++){
                res.add(res.get(i)+ch);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        ArrayList<String> res = substrings("abcd");
        res.stream().forEach(e-> System.out.println(e));
    }
}
