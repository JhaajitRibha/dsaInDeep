package striverDsaSheet.ArrayPartThree.power;


//    If nn is even:
//            xn=(xn/2)×(xn/2)
//            If nn is odd:
//            xn=x×xn−1


public class PowerA1 {
    public double myPow(double x, int n) {
        double ans=1;
        long m = n;
        if(m<0) {
            m = -m;
        }
        while(m>0){
            if(m%2!=0){
                ans = ans*x;
                m=m-1;
            }else{
                x = x*x;
                m = m/2;
            }
        }
        if(n<0){
            return (1/ans);
        }
        return ans;
    }
    public static void main(String[] args) {

        double x = 2.00000;
        int n = -2147483648;
        System.out.println(new PowerA1().myPow(x,n));

    }
}

