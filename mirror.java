import java.util.Scanner;
public class mirror {
    public static void mir(int arr[],int n) {
        boolean flag=true;
        if(n%2!=0){
            flag=false;
            System.out.println("not mirrored");
        }
        else{
            for(int i=0;i<n;i++){
                if (arr[i]!=arr[n-1-i]){
                    flag=false;
                    System.out.println("not mirrored");
                    break;
                }
            }

        }
        if(flag==true){
            System.out.println("mirrored");
        }       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
        mir(arr,n);
    }
    
}
