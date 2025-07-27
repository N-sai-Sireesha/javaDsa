import java.util.*;
public class twod {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // for(int[]row:arr){
        //     for(int val:row){
        //     System.out.print(val+" ");
        // }
        // System.out.println();
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        // for(int []row:arr){
        //     System.out.println(Arrays.toString(row));
        // }
        int min1=1000,max1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1){
                    min1=Math.min(arr[i][j],min1);
                }
                else{
                    max1=Math.max(arr[i][j],max1);
                }
            }
        }
        System.out.println(max1-min1);
        
    }
}
