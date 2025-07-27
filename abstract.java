abstract class Super{
    public Super(){
        System.out.println("Super construtor");
    }
    public void meth1(){
        System.out.println("super method");
    }
    abstract public void meth2();
}
class Child extends Super{
    public Child(){
        System.out.println("child superc class");
    }
    public void meth2(){
        System.out.println("child class method 2");
    }
}
class Abstract{
    public static void main(String[] args){
        Child s=new Child();
        s.meth1();
        s.meth2();


    }
}