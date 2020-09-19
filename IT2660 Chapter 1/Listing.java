import java.util.Scanner;

public class Listing
{
 private String name;
 private int age;
 
 public void input()
 { 
   Scanner KB = new Scanner(System.in);
   System.out.print("Enter your name: ");
   name = KB.next();
   System.out.print("Enter your age: ");
   age = KB.nextInt();
 }

 public String getName()
 { 
   return (name);
 }
 
  public int getAge()
 { 
   return (age);
 
 }
    
}