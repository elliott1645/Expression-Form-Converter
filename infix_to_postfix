import java.util.Stack;

public class infixpostfix {

 
//Checks if the input is an operator or not, paramater c checked, returns true if operator
	
 private boolean isOperator(char c){
  if(c == '+' || c == '-' || c == '*' || c =='/' || c == '^')
   return true;
  return false;
 }
 
 
 //compares c1 and c2, sees if c2 has same or higher precedence than c1
 //c1 is first operator, c2 is second. returns true if c2 is same or higher
 
 private boolean checkPrecedence(char c1, char c2){
  if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
   return true;
  else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
   return true;
  else if((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
   return true;
  else
   return false;
 }
 
 
 
 
 //converts the infix expression to postfix
 //parameter infix is infix expression to be converted
 //returns the postfix expression
 
 
 public String convert(String infix){
 
  String postfix = "";  //equivalent postfix is empty initially
  Stack<Character> s = new Stack<>();  //stack to hold symbols
  s.push('#');  //symbol to denote end of stack


  for(int i = 0; i < infix.length(); i++){
   char inputSymbol = infix.charAt(i);  //symbol to be processed
   if(isOperator(inputSymbol)){  //if a operator
    //repeatedly pops if stack top has same or higher precedence
    while(checkPrecedence(inputSymbol, s.peek()))
     postfix += s.pop();
    s.push(inputSymbol);
   }
   else if(inputSymbol == '(')
    s.push(inputSymbol);  //push if left parenthesis
   else if(inputSymbol == ')'){
    //repeatedly pops if right parenthesis until left parenthesis is found
    while(s.peek() != '(') 
     postfix += s.pop();
    s.pop();
   }
   else
    postfix += inputSymbol;
   
  }

  //pops all elements of stack left
  while(s.peek() != '#'){
   postfix += s.pop();
  

  }
  
  return postfix;
 }
 
 
 
 //Formats the input stack string
 //parameter s is a stack converted to string
 //returns formatted input
 
 private String format(String s){
  s = s.replaceAll(",","");  //removes all , in stack string
  s = s.replaceAll(" ","");  //removes all spaces in stack string
  s = s.substring(1, s.length()-1);  //removes [] from stack string
  
  return s;
 }
}
 
