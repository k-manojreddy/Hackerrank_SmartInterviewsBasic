import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long n=new Scanner(System.in).nextLong();
        long c=0;
        while(n!=0){
            c=(c*10)+(n%10);
            n=n/10;
        }
        System.out.print(c);
    }
}