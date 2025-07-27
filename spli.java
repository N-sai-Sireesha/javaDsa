package strings;
import java.util.*;
public class spli {
    public static void main(String[] args) {
        String s="hello how are you";
        String []res=s.split(" ");
        String res1="";
        for(String ch:res){
            char c=Character.toTitleCase(ch.charAt(0));
            res1+=c;
            for(int i=1;i<ch.length();i++){
                res1+=ch.charAt(i);
            }
            res1+=" ";
        }System.out.println(res1);
    }
}
