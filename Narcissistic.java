import java.util.*;

public class Narcissistic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long n=new Scanner(System.in).nextLong();
        long k=n,c=0;
        String s="9";
        while(n!=0){
            long r=n%10;
            for(;;){
                if(k<=Integer.parseInt(s)){
                   c+=(long)Math.pow(r,s.length());
                    break;
                }
                s+="9";
            }
            n=n/10;
        }
        System.out.println(((k==c)?"Yes":"No"));
    }
}