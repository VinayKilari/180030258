class P9
{
     public static void main(String[] args)
     {
          int a=Integer.parseInt(args[1]);
          if(args[0].equals("Female") && (a>=1 && a<=58))
                   System.out.println("Interest == 8.2% ");
          else if(args[0].equals("Female") && (a>=59 && a<=120))
                   System.out.println("Interest == 7.6% ");                  
          else if(args[0].equals("Male") && (a>=1 && a<=60))
                   System.out.println("Interest == 9.2% ");
            else if(args[0].equals("Male") && (a>=61 && a<=120))
                   System.out.println("Interest == 8.3% ");
       }
}