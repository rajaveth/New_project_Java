package stack_program;

import java.util.Stack;

public class StackPushPopEx {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(20);
        stack.push(35);
        stack.push(99);

        stack.pop();
        System.out.println(stack);
    }
}
