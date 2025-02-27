import java.util.*;

class uppercase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
         String FinalString = str.toUpperCase();
         System.out.println("Upper Case String: "+ FinalString);
         sc.close();
    }
}