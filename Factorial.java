import java.util.*;


public class Factorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a=new Scanner(System.in).nextInt(),s=1;
        if(a>=0&&a<=10)
            for(int i=1;i<=a;i++)
                s=s*i;
        System.out.print((s==0)?1:s);
    }
}