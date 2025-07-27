// 
class rectangle{
    private double length;
    private double breadth;
    public double getlength(){
        return length;
    }
    public void setlength(double l){
        length=l;
    }
    public double getbreadth(){
        return breadth;
    }
    public void setbreadth(double b){
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
}
class oops{
    public static void main(String[]args){
        rectangle obj=new rectangle();
        obj.setlength(10.0);
        obj.setbreadth(20.0);
        System.out.println("area : "+obj.area());
    }
}