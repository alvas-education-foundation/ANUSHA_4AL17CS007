import java.util.*;

public class Main
{
   public static void main(String args[])
   {
        int i;
        String s;
        int c[] = new int[256];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        s=sc.nextLine();
         for (i = 0; i < s.length(); i++)
            c[(int) s.charAt(i)]++;
        for (i = 0; i < 256; i++) {
            if (c[i] != 0) {
                  System.out.println((char)i + ": " + c[i]);
            }
        }
   }
}


Output:
Enter a String : anusha
a: 2
h: 1
n: 1
s: 1
u: 1
