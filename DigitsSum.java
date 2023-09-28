
import java.util.*;

public class DigitsSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int t=0;
        for(int i=0;i<s.length();i++)
           t+=Integer.parseInt(s.substring(i,i+1));
        System.out.print(t);
        sc.close();
    }
}