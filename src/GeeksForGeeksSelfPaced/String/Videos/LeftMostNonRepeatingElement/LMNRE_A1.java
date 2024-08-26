package GeeksForGeeksSelfPaced.String.Videos.LeftMostNonRepeatingElement;

public class LMNRE_A1 {

    public static int nonRepeatingElement(String word) {
        char[] wordArr = word.toCharArray();

        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if(wordArr[i]=='?'){
                continue;
            }
            flag = true;
            for (int j = i + 1; j < word.length(); j++) {

                if (wordArr[i] == wordArr[j]) {
                    wordArr[j] = '?';
                    flag = false;
                    break;
                }

            }
            if (flag) {
                return i;
            }

        }

        return -1;

    }
    public static void main(String[] args) {

        String word = "racecars";
        System.out.println(nonRepeatingElement(word));




    }
}
