import java.util.*;

public class VowelsInString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s[]={"A","E","I","O","U"};
        Scanner sc=new Scanner(System.in);
        String n=sc.next(); boolean isVowel;
        for(int i=0;i<n.length();i++){
            isVowel=false;
            for(int j=0;j<s.length;j++){
                if(n.substring(i,i+1).equalsIgnoreCase(s[j])){
                    isVowel=true;break;
                }
            }
            if(!isVowel){
                System.out.print("No");return;
            }
        }
        System.out.print("Yes");
        sc.close();
    }
}