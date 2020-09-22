class Stack
{
 private int Listing[];
 private int top;
 private int capacity;

 Stack(int size)
 {
  Listing = new int[size];
  capacity = size;
  top = -1;
 }

 public void push(int x)
 {
  if (isFull())
  {
   System.out.println("OverFlow\nProgram Terminated\n");
   System.exit(1);
  }

  System.out.println("Inserting " + x);
  Listing[++top] = x;
 }

 public int pop()
 {
  if (isEmpty())
  {
   System.out.println("UnderFlow\nProgram Terminated");
   System.exit(1);
  }

  System.out.println("Removing " + peek());

  return Listing[top--];
 }

 public int peek()
 {
  if (!isEmpty())
   return Listing[top];
  else
   System.exit(1);

  return -1;
 }

 public int size()
 {
  return top + 1;
 }

 public Boolean isEmpty()
 {
  return top == -1;
 }

 public Boolean isFull()
 {
  return top == capacity - 1;
 }

}