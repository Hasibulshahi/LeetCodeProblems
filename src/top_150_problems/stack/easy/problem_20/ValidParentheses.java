package top_150_problems.stack.easy.problem_20;

import java.util.Stack;

public class ValidParentheses {
    public ValidParentheses() {
        System.out.println("***************** 20. Valid Parentheses ********************");
        String s1 = "{[()]}";
        String s2 = "{[([])]}";
        System.out.println(s1 +" -> "+isValid(s1));
        System.out.println(s2 +" -> "+isValid(s2));
    }
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                str.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (str.isEmpty())
                    return false;

                char top = str.pop();
                if (!matching(top, c))
                    return false;
            }
        }
        return str.isEmpty();
    }
    public boolean matching(char open, char close) {
        return (open == '(' && close == ')'
                || open == '{' && close == '}'
                || open == '[' && close == ']');
    }
}
