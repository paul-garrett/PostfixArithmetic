import java.util.Stack;

public class Main{
  // method that evaluates value of a postfix expression
  static int evaluatePostfix(String exp)
  {
  // create stack 
    Stack<Integer> stack = new Stack<>();
  // scan all characters one at a time using a for loop
    for (int i = 0; i < exp.length(); i++) {
      char c = exp.charAt(i);
      // if the character is a digit, push it to the stack
      if (Character.isDigit(c)) 
        stack.push(c - '0');
      // if the character is an operator, pop two elements from the stack, perform the operation and push the result back to the stack
      else {
        int val1 = stack.pop();
        int val2 = stack.pop();
        switch (c) {
          case '+':
            stack.push(val2 + val1);
            break;
          case '-':
            stack.push(val2 - val1);
            break;
          case '*':
            stack.push(val2 * val1);
            break;
          case '/':
            stack.push(val2 / val1);
            break;
        }  
      }
    }
    return stack.pop();
  }
  // main method
  public static void main(String[] args) {
    String exp = "42+3-7*";
    // print the result
    System.out.println("Postfix evaluation: " + evaluatePostfix(exp));
  }
}
