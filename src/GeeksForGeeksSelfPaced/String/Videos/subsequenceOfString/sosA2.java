package GeeksForGeeksSelfPaced.String.Videos.subsequenceOfString;

public class sosA2 {

    //abcd
    //ac

    public static boolean subSequenceChecker(String string,String substring){

        int j=0;
        int i=0;
       for(;i<string.length() && j<substring.length();){
           if(string.charAt(i)==substring.charAt(j)){
               i++;
               j++;
           }
           else{
               i++;
           }
       }

       return j==substring.length();
    }

    public static void main(String[] args) {

        System.out.println(subSequenceChecker("geeksforgeeks","grges"));
    }

}
