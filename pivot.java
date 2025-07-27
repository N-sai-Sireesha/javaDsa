import java.util.*;
class pivot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }
        int left_sum=0;
        for(int i=0;i<n;i++){
            if(left_sum==sum1-left_sum-arr[i]){
                System.out.println(i);
                break;
            }
            left_sum+=arr[i];
        }sc.close();

    }
}


    

