package strings;
import java.util.*;
public class occurnace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int count[]=new int[256];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            count[c]++;
        }
        boolean[]printed=new boolean[256];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(!printed[c]){
                System.out.println(c+" : "+count[c]);
                printed[c]=true;
            }
        }     
    } 
}
