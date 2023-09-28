import java.util.*;

public class RectanglePattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            int k=n;
            for(int j=1;j<=n;j++){
                if(j==i){
                    System.out.print("*");
                    k--;
                }
                else
                    System.out.print(k--);
            }
            System.out.println();
        }
        sc.close();
    }
}