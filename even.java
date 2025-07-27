import java.util.*;
public class even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int num: arr){
            int count=0;
            while(num>0){
                int rem=num%10;
                count+=1;
                num=num/10;
            }
            if(count%2==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
    
}
