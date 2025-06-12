package gfg160.strings.implementAtoi;

public class ImplementAtoiA1 {
    public static int myAtoi(String s) {
        int res = 0;
        String tempRes = "";
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                index=i;
                break;
            }
        }
        for(int j=index;j<s.length();j++){
            tempRes+=s.charAt(j);
        }
        String symbol="";
        if(tempRes.charAt(0)=='+' || tempRes.charAt(0)=='-') {
            symbol+= tempRes.charAt(0);
        }
        index=0;
        s="";
        int k;
        if(symbol.isEmpty()){
            k=0;
        }else{
            k=1;
        }
        for(;k<tempRes.length();k++){
            s+=tempRes.charAt(k);
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                index=i;
                break;
            }
        }
        tempRes="";
        for(int j=index;j<s.length();j++){
            tempRes+=s.charAt(j);
        }

        s="";
        for(int i=0;i<tempRes.length();i++){
            if(tempRes.charAt(i)-'0'>=0 && tempRes.charAt(i)-'0'<=9 ){
                s+=tempRes.charAt(i);
            }else{
            break;}
        }
        if(s.isEmpty()){
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            // Overflow check
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return symbol.equals("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
        }
        if (symbol.equals("-")) {
            res = -res;
        }
        return res;
    }
    public static void main(String[] args) {
//        System.out.println(myAtoi("-00000987xyz"));
//        System.out.println(myAtoi("-00000987xyz"));
        System.out.println(myAtoi("-123"));
//        System.out.println(myAtoi("1231231231311133"));

    }
}
