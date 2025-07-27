import java.util.*;
public class small {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        int target=sc.nextInt();
        int res[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    res[i]=i;
                    res[j]=j;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
