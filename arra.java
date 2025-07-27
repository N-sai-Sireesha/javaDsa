import java.util.*;
public class arra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[][]=new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int arr2[]={1,2,3,4,5};
        System.out.print(Arrays.toString(arr2));
        for(int el:arr2){
            System.out.print(el+" ");
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }

}
    
