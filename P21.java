import java.util.*;
class P21
{
public static void main(String[] args) {
  int n,sum=0;
  Scanner sc= new Scanner(System.in);
 System.out.print("Enter The Number : ");
  n=sc.nextInt();
  int t=n;
  while(n>0)
  {
     sum=(sum*10)+n%10;
     n=n/10;
  }
  if(t==sum)
   System.out.println(t+" is a Palindrome Number");
  else
   System.out.println(t+" is not a Palindrome Number");
}
}

