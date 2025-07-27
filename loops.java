import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int k=num1;k<=num2;k++) {
            int sum=0;
            int temp=k;
            while(temp>0){
                int fact=1;
                int rem=temp%10;
                for(int i=1;i<=rem;i++){
                    fact=fact*i;
                }
                sum+=fact;
                temp=temp/10;     
            }
            if(k==sum){System.out.println("strong numbers: "+k+" ");}
        }
    }
}

