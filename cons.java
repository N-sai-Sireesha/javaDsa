import java.util.*;
public class cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        int count=0,max_count=0;
        for(int num: arr){
            if(num==1){
                count+=1;
            }
            else{
                count=0;
            }
            max_count=Math.max(count,max_count);
        }
        System.out.println(max_count);
    }
}
