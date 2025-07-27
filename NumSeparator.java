import java.util.Scanner;
public class NumSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        int even=0,odd = 0;
        int temp=num;
        int rev=0;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        while(rev>0){
            int re=rev%10;
            if(re%2==0){
                even=even*10+re;
            }
            else{
                odd=odd*10+re;
            }
            rev=rev/10;
        }
        int result = even - odd;
        System.out.println("Result: " + result);
    }
}

