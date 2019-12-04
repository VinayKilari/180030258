import java.util.*;
class P7
{
    public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Character : ");
        char a=sc.next().charAt(0);
        System.out.print("Enter The Second Character : ");
        char b=sc.next().charAt(0);
        if(a<b)
            System.out.println(a+","+b);
        else if(b<a)
             System.out.println(b+","+a);     
  }
}