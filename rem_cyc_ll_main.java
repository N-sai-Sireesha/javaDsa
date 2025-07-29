// ListNode.java
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Solution.java
class Solution {
    public ListNode rem_cyc_ll(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle using Floyd's Cycle Detection algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle found
        if (fast == null || fast.next == null) {
            return head;
        }

        // Reset slow to head
        slow = head;

        // Cycle starts at head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            // Find the start of the loop
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Remove cycle
        fast.next = null;

        return head;
    }

    // Utility method to print the list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main.java
public class rem_cyc_ll_main {
    public static void main(String[] args) {
        // Creating a cycle list: 1 -> 2 -> 3 -> 4 -> 5 -> 3 ...
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next; // Cycle created at node 3

        Solution solution = new Solution();
        head = solution.rem_cyc_ll(head); // Removes cycle

        System.out.println("Linked List after removing cycle:");
        solution.printList(head); // Should print: 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}
