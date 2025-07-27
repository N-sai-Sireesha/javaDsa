package strings;
import java.util.*;
public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int count=0,max_count=0;
        String stack="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(stack.indexOf(ch)==-1){
                stack+=ch;
                count++;
            }
            else{
                while(stack.indexOf(ch)!=-1){
                    stack=stack.substring(1);
                    count--;
                }
                stack+=ch;
                count++;
            }    
            max_count=Math.max(count,max_count);
        }System.out.println(max_count);  
    }  
}
