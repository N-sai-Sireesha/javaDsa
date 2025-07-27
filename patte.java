import java.util.*;
public class patte {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+"*"+" ");

            }
            System.out.println();
        }
        // for(int i=1;i<=n;i++){
        //     int spaces=i;
        //     for(int j=1;j<spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=spaces-1;k<n;k++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     int s=1;
    //         int spaces=i;
    //         for(int k=1;k<spaces;k++){
    //             System.out.print(" ");
    //         } 
    //         for(int j=n;j>=spaces;j--){
    //             if(j==n || i==1 || j==spaces){
    //                 System.out.print(s);
    //                 s++;
    //             }
    //             else{
    //                 System.out.print(" ");
    //                 s++;
    //             }
    //         }
    //         System.out.println();

    //    }
    }

}

