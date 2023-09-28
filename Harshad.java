import java.util.*;

public class Harshad {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=n;
        long c=0;
        while(n!=0){
            c+=(long)n%10;
            n=(long)n/10;
        }
        System.out.print(((k%c)==0&&(c!=0))?"Yes":"No");
        sc.close();
    }
}