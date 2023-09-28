import java.util.*;

public class CompressAString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,j;
        for(i=0;i<s.length();i++){
            char t=s.charAt(i);
            System.out.print(""+t);
            int o=1;
            for(j=i+1;j<s.length();j++){
                if(t==s.charAt(j))
                    o++;
                else
                    break;
            }
            i=j-1;
            System.out.print(o);
        }
        sc.close();
    }
}