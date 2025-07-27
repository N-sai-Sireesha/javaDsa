import java.util.*;
public class rowsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean flag=true;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    flag=false;
                    break;
                }
            }if(!flag){break;}
        }if(flag){System.out.println("true");}
        else{System.out.println("false");}
    }
}
