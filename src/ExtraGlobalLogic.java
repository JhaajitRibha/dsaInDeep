//    Given a string of equal number of odd and even digits.

//
//    Write a Java code to rearrange the string in a manner so that all the odd
//    numbers are in odd indexes (in ascending order) and all the even numbers are
//    in even digits (in descending order).
//
//    e.g. Input String : 0123456789 (Even digits = 0,2,4,6,8, Odd digits = 1,3,5,7,9)
//    Output : 8163452709

import java.util.Arrays;

//0,2,4,6,8 - 8,6,4,2,0
//1,3,5,7,9


public class ExtraGlobalLogic {


    public static String arrangeString(String word){

        int[] odd = new int[word.length()/2];
        int[] even = new int[word.length()/2];
        int oddIndex=0;
        int evenIndex= 0;
        char[] numbers = word.toCharArray();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            int num = Integer.parseInt(String.valueOf(numbers[i]));
            if(num%2==0){
                even[evenIndex++]=num;
            }else{
                odd[oddIndex++] = num;
            }
        }

        Arrays.stream(odd).forEach(x-> System.out.print(x));
        System.out.println("*****");
        Arrays.stream(even).forEach(x-> System.out.print(x));




        return "a";
    }

   


    public static void main(String[] args) {

        arrangeString("0123456789");
    }

}
