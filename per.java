import java.util.*;
public class per {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pos=sc.nextInt();
        int count=0;
    
        for(int i=1;i<=num;i++){
            int temp=i;
            int sum=0;
            for(int j=1;j<temp;j++){
                if(temp%j==0){
                    sum+=j;
                }
            }
            if(i==sum){
                count+=1;
                if(count==pos){
                    System.out.print(i+" ");
                }
                
            }

        }
    }
    
    
}
