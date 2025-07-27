class rec{
    private int length;
    private int breadth;
    public rec(){
        length=1;
        breadth=1;
    }
    public rec(int l,int b){
        length=l;
        breadth=b;
    }
    public int area(){
        return length*breadth;
    }
}
class constructor{
    public static void main(String[] args){
        rec obj=new rec(10,20);
        System.out.println(obj.area());
    }
}