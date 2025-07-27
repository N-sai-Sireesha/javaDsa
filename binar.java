import java.util.*;
public class binar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=(arr[i][j]%2);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            
            }System.out.println();
        }
        for(int[] row:arr){
            int count=0;
            for(int val:row){
                if(val%2!=1){
                    count++;
                }
            }System.out.print(count+" ");

        }
    }
    
}
