package GeeksForGeeksSelfPaced.String.Videos.ReverseWordInString;

public class RWS_A1 {
    public static String reverseWord(String word){

        // i love coding

        //gnidoc evol i

        String reversedWord = reverseSingle(word);

        int start=0;
        int last = 0;

        for(int i=0;i<reversedWord.length();i++){
            if(reversedWord.charAt(i)==' '){
                last = i;
                String newWord = reversedWord.substring(start,last);
                String newWordReverse = reverseSingle(newWord);
                reversedWord = reversedWord.replace(newWord,newWordReverse);
                start =last+1;

            }
        }

        String lastWord = reversedWord.substring(start,reversedWord.length());
        String lastWordReverse = reverseSingle(lastWord);
        reversedWord.replace(lastWord,lastWordReverse);



        return reversedWord;
    }

    public static String reverseSingle(String word){
        String res = "";

        char[] wordArr = word.toCharArray();



        for(int i=0;i<wordArr.length/2;i++){
            char temp = wordArr[i];
            wordArr[i]=wordArr[wordArr.length-1-i];
            wordArr[wordArr.length-1-i] =temp;
        }

        res = new String(wordArr);
        return res;
    }

    public static void main(String[] args) {

        System.out.println(reverseWord("the sky is blue"));
    }

}
