package dataStructures;

import java.util.Stack;

public class BracesMatcher {

    public static boolean areBracesBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(', '{', '[':
                    stack.push(ch);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;

                default:
                    // Ignore other characters
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testInputs = {
                "{[()]}",        // true
                "{[(])}",        // false
                "((()))",        // true
                "{[()]}[",       // false
                "abc{[()]}123",  // true (ignores letters/numbers)
        };

        for (String input : testInputs) {
            System.out.printf("Input: %-12s --> Balanced: %s%n", input, areBracesBalanced(input));
        }
    }
}
