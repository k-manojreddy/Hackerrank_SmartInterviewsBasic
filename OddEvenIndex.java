import java.util.*;

public class OddEvenIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s=new Scanner(System.in).next();
        for(int i=1;i<s.length();i+=2){
            System.out.print(s.charAt(i));
        }
                for(int i=0;i<s.length();i+=2){
            System.out.print(s.charAt(i));
        }
    }
}