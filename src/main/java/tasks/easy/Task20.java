package tasks.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task20 {

    public static boolean isValid(String str) {

        if (str.length() == 0) {
            return true;
        }

        if (str.length() == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        boolean isFirst = true;
        char ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            if (isOpen(ch)) {
                stack.push(ch);
                isFirst = false;

            } else if (Character.isWhitespace(ch)) {
                continue;

            } else {

                if (isFirst) return false;
                if (stack.empty()) return false;

                if (ch == map.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static boolean isOpen(char ch) {

        if (ch == '(' || ch == '[' || ch == '{') {
            return true;
        }
        return false;
    }
}