package GeeksForGeeksSelfPaced.String.Videos.AnagramCheck;

public class AcA1 {
   //listen,silent

    public static boolean anagramChecker(String wordOne,String wordTwo){
        int[] count = new int[26];
        int[] countTwo = new int[26];

        for(int i=0;i<wordOne.length();i++){
             count[wordOne.charAt(i)-'a']++;
        }

        for(int i=0;i<wordTwo.length();i++){
            countTwo[wordTwo.charAt(i)-'a']++;
        }

        for(int i=0;i<count.length;i++){
            System.out.println("counter : " + count[i] + " / counterTwo :" + countTwo[i]);
            if(count[i]!=countTwo[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(anagramChecker("silent","listeen"));
    }
}
