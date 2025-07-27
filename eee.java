import java.util.*;
public class eee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int rev1=0,rev2=0;
        while(n1>0){
            int rem=n1%10;
            rev1=rev1*10+rem;
            n1/=10;
        }
        while(n2>0){
            int rem=n2%10;
            rev2=rev2*10+rem;
            n2/=10;
        }
        System.out.println(rev1>rev2? "greater number: "+rev1:rev2);
    }
    
}
