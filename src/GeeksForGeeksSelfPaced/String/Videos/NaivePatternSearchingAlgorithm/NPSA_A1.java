package GeeksForGeeksSelfPaced.String.Videos.NaivePatternSearchingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class NPSA_A1 {

    public static List<Integer> findingSubString(String a,String b){
        ArrayList<Integer> result = new ArrayList<>();

        char[] s = a.toCharArray();
        char[] t = b.toCharArray();

        int m =s.length;
        int n = t.length;
        int i=0;
        int j=0;

        while(i<m){

            if(j==n){
                result.add(i-n);
                j=0;
            }
            if(s[i]==t[j]){
                i++;
                j++;
            }else{
                j=0;
                i=i-1;
                i++;

            }


        }

        if(j==n){
            result.add(i-n);
        }

        return result;
    }



    public static void main(String[] args) {
        String s1 = "ababkaabc";
        String s2 = "abka";



        List<Integer> res = findingSubString(s1,s2);

        res.stream().forEach(e-> System.out.println(e));
    }
}
