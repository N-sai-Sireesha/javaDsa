class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class doull {
    ListNode head;

    void traversal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" <-> null"); // better format
    }

    void insertatbegin(int data) {
        ListNode new_node = new ListNode(data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }
     void insertatend(int data) {
        ListNode new_node = new ListNode(data);
        if (head == null) {
            head = new_node;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    
}
    void insertatpos(int data,int pos){
        ListNode newnode=new ListNode(data);
        if(pos==1){
            newnode.next=head;
            if(head!=null){
                head.prev=newnode;
            }
            head=newnode;
        }
        ListNode temp=head;
        int count=1;
        while(temp!=null && count<pos-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("out of range");
            return;
        }
        newnode.next=temp.next;
        newnode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newnode;
        }
        temp.next=newnode;
        return;
    }
    void deleteatend(int data){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
        return;
    }
    void deleteatbeg(int data){
        if(head==null){
            System.out.println("ll is empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        ListNode temp=head;
        head=head.next;
        head.prev=null;

}
    void deleteatpos(int data,int pos ){
        if(pos==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
                return;
            }
            
        }
        ListNode temp=head;
        int count=1;
        while(temp!=null && count<pos){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("out of range");
            return;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        

    }
}

public class dll1 {
    public static void main(String[] args) {
        doull d = new doull();
        d.insertatbegin(10);
        d.insertatend(20);
        d.insertatend(30);
        d.insertatend(40);
        d.insertatend(50);
        d.insertatend(60);
        d.insertatend(70);
        d.deleteatend(70);
        d.deleteatbeg(10);
        d.deleteatpos(20, 1);
        d.insertatpos(25,3);
        System.out.println("Doubly Linked List Traversal:"); 
        d.traversal();                                        
    }
}
 