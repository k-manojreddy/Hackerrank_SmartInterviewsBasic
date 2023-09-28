import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long n=new Scanner(System.in).nextLong();
        long k=n,c=0;
        while(n!=0){
           c+=(n%10)*(n%10)*(n%10);
            n=n/10;
        }
        System.out.println(((k==c)?"Yes":"No"));
    }
}