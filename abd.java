import java.util.*;
public class abd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        // 7 5 3 8
        int prev=rev%10;
        int result=rev%10;
        rev=rev/10;
        while(rev>0){
            int rem=rev%10;
            int n=Math.abs(prev-rem);
            result=result*10+n;
            prev=rem;
            rev/=10;
        }
        System.out.println(result);
        sc.close();
    }
    
}
