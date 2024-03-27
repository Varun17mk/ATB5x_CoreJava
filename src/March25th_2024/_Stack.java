package src.March25th_2024;

import java.util.Stack;

public class _Stack {
    public static void main(String[] args)
    {
        Stack<Object> stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);

        System.out.println(stack.pop()); // Pop - removing last element
        System.out.println(stack);
        System.out.println(stack.peek()); // Observing last element
        System.out.println(stack);
    }
}
