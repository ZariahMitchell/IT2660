import java.util.Scanner;

public class reverseArray { 

 private String name;
 private int age;
 Scanner KB=new Scanner(System.in);
 
    public void openAccount()
 { 

  System.out.print("Enter Name: ");
  name=KB.next();
  System.out.print("Enter Age: ");
  age=KB.nextInt();
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