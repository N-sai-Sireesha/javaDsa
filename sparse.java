import java.util.*;
public class sparse {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            } 
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j  || i+j==n-1 &&(i==j)!=(i+j==n-1)){
                    sum1+=arr[i][j];
                }

            }
        } 
        System.out.println(sum1);
    }
}

