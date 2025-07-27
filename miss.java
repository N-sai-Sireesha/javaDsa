import java.util.*;
public class miss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum1=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            sum1+=arr[i];
            res[i]=sum1;
        }
        System.out.println(Arrays.toString(res));
        

    }
       
}
    

