import java.util.Stack;

public class InbuiltExamples {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(25);
    stack.push(25);
    stack.push(25);
    stack.push(25);
    stack.push(25);
    stack.push(25);
    stack.push(25);

    System.out.println(stack);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
