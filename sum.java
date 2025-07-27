import java.util.Scanner;
public class sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // element based sum
        int o_sum=0,e_sum=0;
        for(int el: arr){
            if(el%2==0){
                e_sum+=el;
            }
            else{
                o_sum+=el;
            }
        }
        System.out.println(o_sum-e_sum);
        //index based sum
        int e=0,s=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                e+=arr[i];
            }
            else{
                s+=arr[i];
            }
        }
        System.out.println(s-e);
    }
    
}
