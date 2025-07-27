import java.util.*;
public class bank {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      
        double inital_amount=0;
        boolean bool=true;
        while(bool){
            System.out.println("1->(deposit) 2->(withdraw) 3->(check balance) 4->exit");
            int n=sc.nextInt();
            switch (n) {
            case 1:
                System.out.println("enter deposit money: ");
                int amount=sc.nextInt();
                inital_amount=inital_amount+amount;
                break;
            case 2:
                System.out.println("enter withdrawl money: ");
                int with_amount=sc.nextInt();
                if(with_amount>inital_amount)System.out.println("inefficent");
                else inital_amount-=with_amount;
                break;
            case 3:
                System.out.println("check balance");
                System.out.println("available balance: "+inital_amount);
            
                break;
            case 4:
                bool=false;
                break;
        
            default:System.out.println("kallu dengaya puku na madda");
                break;
        }
        }
    sc.close();
        
       
    }
}
