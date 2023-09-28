import java.util.*;

public class ToggleCaseOfChar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))
                System.out.print(s.substring(i,i+1).toLowerCase());
            else
                System.out.print(s.substring(i,i+1).toUpperCase());
        }
        sc.close();
    }
}