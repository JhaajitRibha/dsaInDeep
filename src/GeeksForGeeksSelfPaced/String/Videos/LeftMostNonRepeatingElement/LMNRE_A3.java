package GeeksForGeeksSelfPaced.String.Videos.LeftMostNonRepeatingElement;

import java.util.Arrays;

public class LMNRE_A3 {
    public static int nonRepeatingChar(String word){

        int[] count = new int[256];
        Arrays.fill(count,-1);

        for(int i=0;i<word.length();i++){
            if(count[word.charAt(i)]==-1){
                count[word.charAt(i)]=i;
            }else{
                count[word.charAt(i)]=-2;
            }
        }

        int index = Integer.MAX_VALUE;
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                index = Math.min(count[i],index);
            }
        }


        return index>0?index:-1;
    }
    public static void main(String[] args) {

        System.out.println(nonRepeatingChar("abbkcdefg"));
    }
}
