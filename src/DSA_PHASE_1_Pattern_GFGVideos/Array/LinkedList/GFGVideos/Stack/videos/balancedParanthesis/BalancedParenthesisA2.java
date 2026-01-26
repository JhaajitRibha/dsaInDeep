package DSA_PHASE_1_Pattern_GFGVideos.Array.LinkedList.GFGVideos.Stack.videos.balancedParanthesis;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedParenthesisA2 {
    public static boolean balancedParenthesisA2(String word) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            if (words[i] == '{' ||
                    words[i] == '(' ||
                    words[i] == '[' ){

                stack.push(words[i]);
                continue;

            }else{

                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(words[i] == ')'  && !(top=='(')){
                    return false;
                }
                if(words[i] == '}'  && !(top=='{')){
                    return false;
                }
                if(words[i] == ']'  && !(top=='[')){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(balancedParenthesisA2("[()]{}{[()()]()}"));
        System.out.println(balancedParenthesisA2("[(])"));
    }
}
