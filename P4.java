import java.util.*;
class P4
{
   public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter The Number : ");
      int n=sc.nextInt();
      if(n<0)
         System.out.println("Negative");
      else if(n==0)
         System.out.println("Zero ");
       else
           System.out.println("Positive");   
  }
}