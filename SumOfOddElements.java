
import java.util.*;

public class SumOfOddElements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),su=0;
        String s[]=new String[n];
        if(n>=1&&n<=100){
            for(int i=0;i<n;i++)
                s[i]=sc.next();
            for(int i=0;i<n;i++){
                if(Integer.parseInt(s[i])<=0){
                    int x=Integer.parseInt(s[i])*-1;
                    if(x%2==1)
                    su-=x;
                }
                else{
                    int x=Integer.parseInt(s[i]);
                    if(x%2==1)
                    su+=x;
                }
            }
            System.out.print(su);
        }
        sc.close();
    }
}