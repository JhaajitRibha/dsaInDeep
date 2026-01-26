package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Stack.videos.balancedParanthesis;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean balancedParenthesis(String word) {
        String[] wordsArray = word.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals("{") ||
                    wordsArray[i].equals("(") ||
                    wordsArray[i].equals("[")) {

                stack.push(wordsArray[i]);
                continue;

            }else{

                if(stack.isEmpty()){
                    return false;
                }
                String top = stack.pop();
                if(wordsArray[i].equals(")") && !top.equals("(")){
                    return false;
                }
                if(wordsArray[i].equals("}") && !top.equals("{")){
                    return false;
                }
                if(wordsArray[i].equals("]") && !top.equals("[")){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(balancedParenthesis("[()]{}{[()()]()}"));
        System.out.println(balancedParenthesis("[(])"));
    }
}
