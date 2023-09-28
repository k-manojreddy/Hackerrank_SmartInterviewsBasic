import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s=new Scanner(System.in).next();
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
}