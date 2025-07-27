import java.util.*;
public class balanced {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,count=0;
        int r_sum=0,l_sum=0;
        while(temp>0){
            int rem=temp%10;
            count+=1;
            temp=temp/10;
        }
        int temp1=num;
        int c=count/2;
        while(temp1>0){
            if(c>0){
                c-=1;
                int rem=temp1%10;
                r_sum+=rem;
            }
            temp1/=10;  
            
        }
        int temp2=num;
        int rev=0;
        while(temp2>0){
            int rem=temp2%10;
            rev=rev*10+rem;
            temp2/=10;
        }
        int temp3=rev;
        int c1=count/2;
        while(temp3>0){
            if(c1>0){
                c1-=1;
                int rem=temp3%10;
                l_sum+=rem;
            }
            temp3/=10;  
            
        }
        if(l_sum==r_sum){
            System.out.println("balanced");
        }

    }
        
    

}
    

