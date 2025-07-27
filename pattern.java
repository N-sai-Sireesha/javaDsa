import java.util.*; 
class pattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n=sc.nextInt();
        double num =(int)(Math.random()*n);
        System.out.println("enter the limit choices: ");
        int choice=sc.nextInt();
        int count=1;
        while(count<=choice){
            System.out.print("enter the guess number: ");
            int gues=sc.nextInt();
            count++;
            if(gues==num){
                System.out.println("congrats: ");
            }
            else if(gues>num){
                System.out.println("too high: ");
            }
            else if(gues<num){
                System.out.println("too low: ");
            }
            else if (count>choice){
                System.out.println("your chances are over try again!");
            }
            else{
                System.out.println("invalid input: ");
            }

        }
        

        
    }
}