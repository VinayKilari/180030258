import java.util.*;
class P10
{
    public static void main(String[] args)
   {
          Scanner sc=new Scanner(System.in);
         System.out.print("Enter The Character : ");
         char n=sc.next().charAt(0);
         if(Character.isLowerCase(n))
                     System.out.println(n+"->"+Character.toUpperCase(n));
         else if(Character.isUpperCase(n))
                     System.out.println(n+"->"+Character.toLowerCase(n));
     }
}