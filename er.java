import java.util.Scanner;
public class er {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            int sum=0;
            int temp=i;
            String count=Integer.toString(i);
            int num=count.length();
            while(temp>0){
                int rem=temp%10;
                sum+=Math.pow(rem,num--);
                temp=temp/10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
} 