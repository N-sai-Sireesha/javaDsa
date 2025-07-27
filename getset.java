package oops;

class Student {
    private String name;
    private int rollno;
    private String branch;
    public void setName(String n,int r,String b){
        name=n;
        rollno=r;
        branch=b;
    }
    public String getName(){
        return name;
      
    }
}
class getset{
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("sumanth", 20, "cse");
        System.out.println(s.getName());
    }
}
