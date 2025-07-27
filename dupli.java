package strings;
import java.util.*;
public class dupli {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[]arr=str.toCharArray();
        String res="";
        for(char ch:arr){
            if(Character.isUpperCase(ch)){
                res+=Character.toLowerCase(ch);
            }
            else{
                res+=Character.toUpperCase(ch);
            }
        }System.out.println(res);
       
    
}
}
