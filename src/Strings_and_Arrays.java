import java.util.Scanner;
 
public class Strings_and_Arrays {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if(shuffle(s1,s2,s3)){
            System.out.println("Valid case");
        }else{
            System.out.println("Invalid case");
        }
    }
    public static boolean shuffle(String s1, String s2, String s3){
        
        for(int i = 0 ; i < s1.length() ; i++){
            boolean check = false;
            for(int j=0;j < s3.length();j++){
                if(s3.charAt(j) == s1.charAt(i)){
                    j++;
                    check = true;
                    break;
                }
                
            }
            if(!check){
                return false;
            }
        }
        
        for(int i = 0 ; i < s2.length() ; i++){
            boolean check = false;
            for(int j=0;j< s3.length();j++){
                if(s2.charAt(i) == s3.charAt(j)){
                    check = true;
                    j++;
                    break;
                }
              
            }
            if(!check){
                return false;
            }
        }
        return true;
    }
}