
import java.util.*;
class Remove_Vowels {
   static String removeVowels(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        int len =  s.length();
        for(int i = 0;i<len;i++)
        {
        char sc = s.charAt(i);
        if(sc == 'a'|| sc == 'e'  || sc=='i' || sc=='o' || sc=='u'||sc=='A'||sc=='E'||sc=='I'||sc=='O'||sc=='U')
        {
            continue;
        }
        result.append(sc);
        
        
        
        
        }
        return result.toString();
    }

public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  System.out.print(removeVowels(s));
}
}
