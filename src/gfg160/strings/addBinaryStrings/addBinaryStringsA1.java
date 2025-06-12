package gfg160.strings.addBinaryStrings;

public class addBinaryStringsA1 {

    //000111
    //00111
    //1101
    //*111
    //10100
    public static String addBinary(String s1, String s2) {

        int limiti=0;
        int limitj=0;
        while(limiti<s1.length() && s1.charAt(limiti)!='1'){
            limiti++;
        }
        while(limitj<s2.length() && s2.charAt(limitj)!='1'){
            limitj++;
        }

        if(s2.length()-limitj>s1.length()-limiti){
            String temp=s1;
             s1=s2;
             s2=temp;
             int tempInt = limiti;
             limiti=limitj;
             limitj=tempInt;
        }

        String res = "";
        int temp=0;
        int sum=0;
        int carry=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
        int a=0;
        int b=0;
        while(i>=limiti && j>=limitj){
            a=s1.charAt(i)-'0';
            b=s2.charAt(j)-'0';
            sum=carry+a+b;
            temp=sum%2;
            carry=sum/2;
            res=(char)(temp+'0')+res;
            i--;
            j--;
        }

        while(i>=limiti) {
            a = s1.charAt(i) - '0';
            sum = a + carry;
            temp = sum % 2;
            carry = sum / 2;
            res = (char)(temp+'0')+res;
            i--;
        }

        return (carry!=0?carry+res:res);
    }
    public static void main(String[] args) {
        System.out.println(addBinary("00101","0"));
    }
}
