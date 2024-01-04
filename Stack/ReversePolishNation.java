package Stack;

import java.util.Stack;

public class ReversePolishNation {
    public static void main(String[] args){
        ReversePolishNation reversePolishNation = new ReversePolishNation();
        System.out.println(reversePolishNation.evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(reversePolishNation.evalRPN(new String[]{"4","13","5","/","+"}));

    }
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();
      for(String s: tokens){
          if(s.equals("+")){
              int num1 = stack.pop();
              int num2 = stack.pop();
              stack.push(num1+num2);
          }
          else if(s.equals("-")){
              int num1 = stack.pop();
              int num2 = stack.pop();
              stack.push(num2-num1);
          }
          else if(s.equals("*")){
              int num1 = stack.pop();
              int num2 = stack.pop();
              stack.push(num1*num2);
          }
          else if(s.equals("/")){
              int num1 = stack.pop();
              int num2 = stack.pop();
              stack.push(num2/num1);
          }
          else{
              stack.push(Integer.parseInt(s));
          }
      }
      return stack.peek();
    }
}
