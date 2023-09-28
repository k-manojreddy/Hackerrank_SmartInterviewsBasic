import java.util.*;

public class OccurenceOfaChar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.next();//Takes a character
        int t=0;
        for(int i=0;i<s.length();i++)
            if((s.substring(i,i+1)).equals(c))
                t++;
        System.out.print(t);
        sc.close();
    }
}