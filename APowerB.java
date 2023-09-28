import java.util.*;

public class APowerB {
    static long power(long a,long b){
        if(b<=0)
            return 1;
        else
            return a*power(a,b-1);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong();
        if(a>=1&&a<=100&&b>=0&&b<=9)
            System.out.print(power(a,b));
        sc.close();
    }
}