import java.util.Scanner;
public class es {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the hours: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("invalid");
        }
        System.out.println((n<=2)? 50:(50+(n-2)*20));

            
        }
    }
    

