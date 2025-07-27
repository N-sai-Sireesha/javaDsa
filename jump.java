import java.util.*;
public class jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<10){System.out.println("jumping number: ");}
        int flag=0;
        int prev=num%10;
        num=num/10;

        while(num>0){
            int rem=num%10;
            if(Math.abs(prev-rem)!=1){
                flag=1;
                break;
            }
            prev=rem;
            num=num/10;
        }
        if(flag==0){
            System.out.println("jumping number: ");
        }
    }
}
