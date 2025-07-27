import java.util.*;
public class sort {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++){
            if(arr[i]>max){
                max=arr[i];
            }  
        }
        int min=Integer.MAX_VALUE;
        for(int i=n/2;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
            System.out.print(max-min);
        }    
    }

