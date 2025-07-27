package strings;
import java.util.*;
public class str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c1=0,c2=0;
        for(int i=0;i<str.length()/2;i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                c1++;

            }
        }
        for(int i=str.length()/2;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                c2++;

            }
        }
       
       
        System.out.println(Math.abs(c1-c2));
    }
}
