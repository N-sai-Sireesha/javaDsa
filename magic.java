import java.util.*;
public class magic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        while(sum>=10){
            int temp1=sum;
            sum=0;
            while(temp1>0){
                int rem=temp1%10;
                sum+=rem;
                temp1/=10;
            }
            System.out.println("generic root: "+sum);
        }

    }
}
