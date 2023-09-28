import java.util.*;

public class PalindromicRightTriangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=48;
            for(int j=1;j<=i;j++)
                System.out.print((char)(++k+16)+" ");
            k=k+16;
            for(int j=i+1;j<=2*i-1;j++){
                System.out.print((char)(--k)+" ");
            }
            System.out.println();
            
        }
        sc.close();
    }
}