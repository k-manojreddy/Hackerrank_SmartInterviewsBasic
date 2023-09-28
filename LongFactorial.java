import java.util.*;


public class LongFactorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long a=new Scanner(System.in).nextLong(),s=1;
        if(a>=0&&a<=20)
            for(long i=1;i<=a;i++)
                s=s*i;
        System.out.print((s==0)?1:s);
    }
}