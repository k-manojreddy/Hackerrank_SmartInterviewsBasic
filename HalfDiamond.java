import java.util.*;

public class HalfDiamond {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            if(i<=n-1/2){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}