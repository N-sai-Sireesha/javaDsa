import java.io.IOException;
import java.util.*;
public class jex {
    public static void main(String[]args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter customer name: ");
        String name=sc.nextLine();
        System.err.println("customer Id: ");
        int id=sc.nextInt();
        System.out.println("enter the number of units: ");
        int units=sc.nextInt();
        if(units<=100){
            double amount=units*1.50;
            amount+=25+(0.05*amount);
            System.out.println("total: "+amount);
        }
        else if(units<=200){
            int rem=units-100;
            double amount=150+(rem)*2.0;
            amount+=25+(0.05*amount);
            System.out.println("total: "+amount);
        }
        else if(units<=300){
            int rem=units-200;
            double amount=550+(rem*3.0);
            amount+=25+(0.05*amount);
            System.out.println(0.05*amount);
            if(amount>500) amount=amount-0.05*amount;
            System.out.println("total: "+amount);

        }

       
    }
    
}
