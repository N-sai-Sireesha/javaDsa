package oops;
class First {
    int a,b;
    First(int x,int y){
        System.out.println("first class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
}
class Second extends First{
    Second(){
        super(10,20);
        System.out.println("second class constructor");
    }
}
public class parentclass{
    public static void main(String[] args) {
        Second obj=new Second();
        obj.sum();
    }
}
