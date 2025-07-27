import java.util.*;
public class besttime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min_val=arr[0];
        int max1=0;
        for(int i=0;i<n;i++){
            min_val=Math.min(min_val,arr[i]);
            max1=Math.max(max1,arr[i]-min_val);
        }
        System.out.println(max1);
    }
}
