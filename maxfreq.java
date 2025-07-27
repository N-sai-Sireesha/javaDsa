package strings;
import java.util.*;
public class maxfreq {
    public static void main(String[] args) {
        String s="misissippi";
        int freq[]=new int[256];
        char result=' ';
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;
            if(freq[ch]>max){
                max=freq[ch];
                result=ch;
            }
        }
        System.out.println(s);
        System.out.println(result);
    }
}
