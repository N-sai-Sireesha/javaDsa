package oops;
class FoodItem {
    String id,name;
    double price;
    int qty;
    double gst,disc,total;
    FoodItem(String id,String name,double price,int qty){
        this.id=id;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
    double calculateBill(){
        double sub=price*qty;
        gst=sub*0.05;
        total=sub+gst;
        if(total>1000){
            disc=total*0.1;
            total-=disc;
        }
        return total;
    }
    void displayDetails(){
        System.out.println("ID "+id);
        System.out.println("Name "+name);
        System.out.println("Unit Price "+price);
        System.out.println("Quantity "+qty);
    }
}
class DineIn extends FoodItem {
    double sc,sub;
    DineIn(String id,String name,double price,int qty,double sc){
        super(id,name,price,qty);
        this.sc=sc;
    }
    double calculateBill(){
        sub=price*qty;
        double amt=sub+sc;
        gst=amt*0.05;
        total=amt+gst;
        if(total>1000){
            disc=total*0.1;
            total-=disc;
        }
        return total;
    }
    void displayDetails(){
        System.out.println("Food Item Record");
        super.displayDetails();
        System.out.println("Service Charge "+sc);
        System.out.println("Subtotal "+sub);
        System.out.println("GST "+gst);
        System.out.println("Discount "+disc);
        System.out.println("Total Bill "+total);
        System.out.println();
    }

}
class Takeaway extends FoodItem {
    double pc,sub;
    Takeaway(String id,String name,double price,int qty,double pc){
        super(id,name,price,qty);
        this.pc=pc;
    }
    double calculateBill(){
        sub=price*qty;
        double amt=sub+pc;
        gst=amt*0.05;
        total=amt+gst;
        if(total>1000){
            disc=total*0.1;
            total-=disc;
        }
        return total;
    }
    void displayDetails(){
        System.out.println("Food Item Record");
        super.displayDetails();
        System.out.println("Packing Charge "+pc);
        System.out.println("Subtotal "+sub);
        System.out.println("GST "+gst);
        System.out.println("Discount "+disc);
        System.out.println("Total Bill "+total);
        System.out.println();
    }
}
class Delivery extends FoodItem {
    double df,sub;
    Delivery(String id,String name,double price,int qty,double df){
        super(id,name,price,qty);
        this.df=df;
    }
    double calculateBill(){
        sub=price*qty;
        double amt=sub+df;
        gst=amt*0.05;
        total=amt+gst;
        if(total>1000){
            disc=total*0.1;
            total-=disc;
        }
        return total;
    }
    void displayDetails(){
        System.out.println("Food Item Record");
        super.displayDetails();
        System.out.println("Delivery Fee "+df);
        System.out.println("Subtotal "+sub);
        System.out.println("GST "+gst);
        System.out.println("Discount "+disc);
        System.out.println("Total Bill "+total);
        System.out.println();
    }
}
public class projectpoly {
    public static void main(String[] args){
        FoodItem[] arr=new FoodItem[3];
        arr[0]=new DineIn("F101","Paneer Butter Masala",250.0,4,50.0);
        arr[1]=new Takeaway("F102","Veg Biryani",180.0,2,20.0);
        arr[2]=new Delivery("F103","Chicken Pizza",300.0,4,40.0);
        for(FoodItem f:arr){
            f.calculateBill();
            f.displayDetails();
        }
    }
}
