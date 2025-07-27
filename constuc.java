package oops;

class constu {
    String name;
    int roll;
    String grade;
    constu(String n,int r,String s){
        name=n;
        roll=r;
        grade=s;
    }
    void display(){
        System.out.println(name+" "+roll+" "+grade);
    }
    
}
class constuc{
    public static void main(String[] args) {
        constu obj=new constu("sumanth",20,"A+");
        obj.display();

    }
}
