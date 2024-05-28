package Day8;

import java.util.Stack;

public class ReverseStack {
    public static void main(String args[]){
        Stack<Character> stack = new Stack<>();
        String str = "Hello World";
        for(char ch:str.toCharArray()){
            stack.push(ch);
        }

        StringBuilder rev = new StringBuilder();
        while(!stack.isEmpty()){
            rev.append(stack.pop());
        }

        System.out.println(str);
        System.out.println(rev);
    }
}
