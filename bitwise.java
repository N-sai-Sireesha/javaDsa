import java.util.Scanner;
public class bitwise {
    public static void main(String args[]){
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%100!=0 || n<0){
            System.out.println("invalid input");
        }
        else{
            int five_num=n/500;
            int two_num=(n%500)/200;
            int hund_num=((n%500)%200)/100;
            if(five_num>0){
                System.out.println("five: "+five_num);
            }
            if(two_num>0){
                System.out.println("two: "+two_num);
            }
            if(hund_num>0){
                System.out.println("hund: "+hund_num);
            }
        sc.close();

        }
        }

        

    }
    

