public class stackTest
{
public static void main (String[] args)
 {
  Stack stack = new Stack(3);
  
  stack.push(1);  
  stack.push(2); 

  stack.pop();  
  stack.pop(); 

  stack.push(3);
  stack.push(4);

  System.out.println("Top element is: " + stack.peek());
  System.out.println("Stack size is " + stack.size());
  
   stack.pop();  
   stack.pop(); 
  
  if (stack.isEmpty())
   System.out.println("Stack Is Empty");
  else{
    System.out.println("Stack Is Not Empty");
  }
  
  stack.push(1);  
  stack.push(2);
  
   if (stack.isEmpty())
   System.out.println("Stack Is Empty");
  else{
    System.out.println("Stack Is Not Empty");
  }
  
 }
}