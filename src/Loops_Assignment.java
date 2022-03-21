//Loops_Assignment
import java.io.*;
public class Loops_Assignment
{
 
    public static void main(String[] args)throws IOException
    {
        
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
 
        int n =Integer.parseInt(in.readLine());        
        for (int i= 1; i<= n ; i++)
        {
            for (int j=i; j <n ;j++)            
        {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) {
                 System.out.print("*");
                 } 
                 System.out.println("");
                 } 
                 for (int i=n; i>=1; i--){
            for(int j=i; j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++)  {
                System.out.print("*");
            }
            System.out.println("");
 
        }
        
    }
}