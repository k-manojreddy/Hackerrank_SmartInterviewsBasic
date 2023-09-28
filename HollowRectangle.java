import java.util.*;

public class HollowRectangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt(),l=sc.nextInt();
        for(int i=1;i<=l;i++){
            for(int j=1;j<=w;j++)
                if(i==1||j==w||i==l||j==1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        sc.close();
    }
}