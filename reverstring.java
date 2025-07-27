import java.util.Scanner;
public class reverstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int left=0,right=str.length()-1;
        char []arr=str.toCharArray();
        while(left<=right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String result=new String(arr);
        String s1="c";
        
        System.out.println(result);
    }
}

