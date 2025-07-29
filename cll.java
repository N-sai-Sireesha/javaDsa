class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    ListNode head;
    void traversal(){
        if(head==null){
        System.out.print("empty");
        return;
    }
    ListNode temp=head;
    do{
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }while(temp!=head);

    System.out.println("null");

    }
    
    

}
public class cll {
    public static void main(String[]args){
        LinkedList l=new LinkedList();
        l.traversal();
    }
    
}
