
import java.util.Stack;
 
public class postfixinfix {
  
 
	
//checks if input is an operator or not
//parameter c is input to be checked
//returns true if c is operator
	
 private boolean isOperator(char c){
  if(c == '+' || c == '-' || c == '*' || c =='/' || c == '^')
  return true;
  return false;
 }
  
 
 
 //converts postfix expression to infix
 //parameter postfix is string expression to be converted
 //returns infix string
 
 public String convert(String postfix){
  Stack<String> s = new Stack<>();
   
  for(int i = 0; i < postfix.length(); i++){
   char c = postfix.charAt(i);
   if(isOperator(c)){
    String b = s.pop();
    String a = s.pop();
    s.push("("+a+c+b+")");
   }
   else
    s.push(""+c);
  }
   
  return s.pop();
  
  
 }
}
