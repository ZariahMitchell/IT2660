import java.util.Scanner;
public class arraytest 
{
   public static void main(String[] args) 
    { 
       Scanner user = new Scanner(System.in);
       System.out.print("How Many Listings Do You Want To Crate? ");
       int n = user.nextInt();
       reverseArray C[]=new reverseArray[n];
       
       for(int i=0;i<C.length;i++)
       {   
         C[i]=new reverseArray();
         C[i].openAccount();
         System.out.println( "This is the reverse order:" + " " + C[i].getAge() + " " + C[i].getName() ); 
       
       }
    } 
}