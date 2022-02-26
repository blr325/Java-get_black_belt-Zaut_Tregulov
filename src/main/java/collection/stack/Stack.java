package collection.stack;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.push("Hello");
        stack.push("what");
        stack.push("your");
        stack.push("name?");
        stack.push("My");
        stack.push("name");
        stack.push("is");
        stack.push("Andrei.");
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        System.out.println("stack.search(\"what\") = " + stack.search("what"));
        System.out.println("stack.indexOf(\"what\") = " + stack.indexOf("what"));
    }
}
