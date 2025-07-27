import java.util.*;
class methods{
    static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        } // if the method is static then we simply call the method
          // if the method is not static then the mehtod is called by creating the object for the class
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=max(a,b);
        System.out.println(c);
    }
}
