package GeeksForGeeksSelfPaced.stack.videos.balancedParenthesis;

import java.util.ArrayDeque;

public class BPA1 {
    public static boolean isBalancedParenthesisOne(String word){
        //({})
        char[] ch = word.toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='{' || ch[i]== '['){
                stack.push(ch[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(ch[i]==')' && stack.pop()!='('){
                    return false;
                }
                if(ch[i]=='}' && stack.pop()!='{'){
                    return false;
                }
                if(ch[i]==']' && stack.pop()!='['){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isBalancedParenthesisOne("([])"));
        System.out.println(isBalancedParenthesisOne("((())"));
        System.out.println(isBalancedParenthesisOne("([)]"));
        System.out.println(isBalancedParenthesisOne("{}([()])"));
        System.out.println(isBalancedParenthesisOne("(()))"));
    }
}
