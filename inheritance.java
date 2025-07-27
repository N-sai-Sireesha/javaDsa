class Parent{
    public Parent(){
        System.out.println("parent constructor");
    }
    public Parent(int x){
        System.out.println("parent constructor 2: "+x);
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("child class constructor");
    }
    public Child(int x,int y){
        super(x);
        System.out.println("Child comstaructor 2: "+y);
    }
}
class inheritance{
    public static void main(String[]args){
        Child obj=new Child(10,20);
    }
}