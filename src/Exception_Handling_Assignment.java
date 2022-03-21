// 1) Write a java program to catch the Arithmetic exception and print a thank you message using finally block. 

import java.io.* ;
public class Exception_Handling_Assignment
{
    
    public static void ArithmeticExe()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int numerator=0, denominator=0;
        try
        {   System.out.println("Enter the numerator:");
            numerator=Integer.parseInt(in.readLine());
            System.out.println("Enter the denominator:");
            denominator=Integer.parseInt(in.readLine());

            System.out.println(numerator+"/"+denominator+"  is  "+(numerator/denominator));
        }
       
         catch(ArithmeticException e)
         {
          System.out.println("Arithmetic exception has occured " );
        }
        finally
        {
        System.out.println("Thank You");//Printing "thank you" message in finally block
        }
         
    }
     public static void main(String[] args)throws IOException {
        ArithmeticExe();    
    }
}