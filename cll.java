class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    void traversal() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    void insertatbeg(int data) {
        ListNode newnode = new ListNode(data);

        if (head == null) {
            newnode.next = newnode; // point to itself
            head = newnode;
            return; // exit early
        }

        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
        head = newnode;
    }
    void insertatend(int data) {
        ListNode newnode = new ListNode(data);

        if (head == null) {
            newnode.next = newnode; // point to itself
            head = newnode;
            return; // exit early
        }

        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }
    void deleteatbeg(int data){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        ListNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=temp.next;

    }
    void deleteatend(int data){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        if(head.next==head){
            head=null;
            return;
        }
        ListNode temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
        return;

        }
    }


public class cll {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.traversal(); 
        l.insertatbeg(10);
        l.insertatbeg(20);
        l.insertatbeg(30);
        l.insertatend(40);
        l.deleteatbeg(30);
        l.deleteatend(40);
        l.traversal(); 
    }
}
