import java.util.*;

public class shuff {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        for(int i=0;i<n/2;i++){
            res[2*i]=arr[i];
            res[2*i+1]=arr[n/2+i];
        }
        System.out.println(Arrays.toString(res));
       
    }
}

