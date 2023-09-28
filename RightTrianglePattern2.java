import java.util.*;

public class RightTrianglePattern2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                double k=((double)j/2)*((2*(n-1))-(j-1));//sum of AP n/2->(double)j/2,2a->2*(n-1),(n-1*d)->-(j-1)
                System.out.print(i+(long)k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}