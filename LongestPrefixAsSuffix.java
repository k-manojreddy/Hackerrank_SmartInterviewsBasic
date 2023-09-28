import java.util.*;

public class LongestPrefixAsSuffix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.substring(0,i+1).equals(s.substring(s.length()-1-i)))
                    l=i+1;
            }
        System.out.print(l);
        sc.close();
    }
}