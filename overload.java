package oops;
class s1 {
    // public void display(int a){
    //     System.out.println(a);
    // }
    // public void display(int a , int b){
    //     System.out.println(a+" "+b);
    // }
    int d1(int a,int b){
        return a+b;
    }
    double d1(double c,double d){
        return c+d;
    }
}
class overload{
    public static void main(String[] args) {
        s1 obj=new s1();
        System.out.println(obj.d1(10,20));
        obj.d1(10.0,20.0);
    }
}
