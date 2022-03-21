import java.util.*;
public class Collections_Assignment {
    public static void ReverseList() {
        
        List<String> StrList = new ArrayList<String>();
        StrList.add("Hashed");
        StrList.add("In");
        StrList.add("By");
        StrList.add("Deloitte");
        
        System.out.println("List before reversing :\n" + StrList);  
        Collections.reverse(StrList);
        System.out.println("List after reversing :\n" + StrList); 
       }




       public static boolean checkAnagram(String a, String b)
    {
        if (a.length() != b.length()) {
            return false;
        }
        
        HashMap<Character, Integer> m = new HashMap<>();
        
        for (int i = 0; i < a.length(); i++) {
            
            if (m.containsKey(a.charAt(i))) {
                
                m.put(a.charAt(i),
                        m.get(a.charAt(i)) + 1);
            }
            else {
                
                m.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            
            if (m.containsKey(b.charAt(i))) {
                
                m.put(b.charAt(i),
                        m.get(b.charAt(i)) - 1);
            }
        }
        Set<Character> charList = m.keySet();
        
        for (Character x : charList) {
            if (m.get(x) != 0) {
                return false;
            }
        }
        return true;
    }       
    public static void main(String[] args) {
   
        ReverseList();
        boolean ans1=checkAnagram("god","dog");//true
        System.out.println(ans1);
        
        boolean ans2=checkAnagram("cat","dog");//false
        System.out.println(ans2);
        




        
    }
}
