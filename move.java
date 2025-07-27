import java.util.*;
public class move {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int res[]=new int[n];
        int left=0,right=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                res[left]=arr[i];
                left++;
            }
            else{
                res[right]=arr[i];
                right--;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
