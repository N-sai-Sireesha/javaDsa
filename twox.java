import java.util.Scanner;
public class twox {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean flag=true;
        if(n!=m){System.out.println("false");}
        System.out.println("Input: ");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }System.out.println("output: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1){
                    if(arr[i][j]==0){
                        flag=false;
                        break;
                    }
                }
                else if(arr[i][j]!=0){
                    flag=false;
                    break;
                }
            }if(!flag){break;}
        }
        if(flag==true){System.out.println("True: x-matrix");}
        else{System.out.println("not an X-matrix");}
    }
}

