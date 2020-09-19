public class listingtest
{
  public static void main(String[] args)
  {
    Listing user = new Listing(); 
    user.input();
    user.getName();
    String name = user.getName();
    int age = user.getAge();
    System.out.println("Output: You are"+ " " + name + " " + "and you are" + " "+ age + " " + "years old");
  }
  
}