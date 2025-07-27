package javapro;
public class queue {
    static int arr[];
    static int size;
    static int rear=-1;
    static int front=-1;
    queue(int n){
        arr=new int[n];
        this.size=n;
    }
    public static boolean isempty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }
    public static int peek(){
        int front=arr[0];
        return front;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static int deq(){
        if (front==-1){
            System.out.print("queue is empty");
        }
        front++;
        return front;
    }
    public static void main(String[] args){
        queue s= new queue(5);
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.display();
        s.deq();
        System.out.println(s.peek());


    }
}
