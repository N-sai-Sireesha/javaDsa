import java.util.*;
public class smae {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        int freq[]=new int[100];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            freq[arr1[i]]++;
        }
        for(int i=0;i<n;i++){
            freq[arr2[i]]--;
        }
        for(int el:freq){
            if(el!=0){
                flag=false;
                System.out.println("not equal");
                break;
            }   
        }
        if(flag==true){
            System.out.println("arrays are equal");
            
        }
    }
}
