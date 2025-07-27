package oops;
import java.util.*;
class student {
    String name="sumanth";
    int roll=20;
    String grade="A+";
    void display(String name,int roll,String grade){
        System.out.println(name+" "+roll+" "+grade);
    }
}
class stu{
    public static void main(String[] args) {
        student obj=new student();
        obj.display(obj.name,obj.roll,obj.grade);
    }
}
