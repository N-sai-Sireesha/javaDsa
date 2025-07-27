import java.util.*;
public class methsum {
    public static void elsum(int n,int arr[]){
        int e=0,o=0;
        for(int el:arr){
            if(el%2!=0){
                o+=el;
            }
            else{
                e+=el;
            }
        }
        System.out.println(o-e);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        elsum(n,arr);
    }
    
}
