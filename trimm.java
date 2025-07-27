package strings;
import java.util.*;
public class trimm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="bcabcaabc";
        String cut="ab";
        String[]res=s.trim().split(cut);
        for(String st:res){
                System.out.print(st);
        }
    }
}
